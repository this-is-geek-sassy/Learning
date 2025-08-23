#include <bits/stdc++.h>
#include <cuda.h>

__global__ void init(int *a, int ln) {
    unsigned int id = blockIdx.x * blockDim.x + threadIdx.x;
    if (id < ln) {
        a[id] = id;
    }
}

int main() {
    int *da, N;
    N = 8000;
    int a[N];

    cudaError_t err = cudaMalloc(&da, N*sizeof(int));
    if (err != cudaSuccess) {
        printf("cudaMalloc failed: %s\n", cudaGetErrorString(err));
        return -1;
    }
    // int no_of_blocks = ceil(N/1024);
    
    int threads_per_block = 1024;
    int no_of_blocks = (N + threads_per_block - 1) / threads_per_block;  // Ceiling division
    init<<<no_of_blocks, 1024>>>(da, N);
    err = cudaGetLastError();
    if (err != cudaSuccess) {
        printf("Kernel launch failed: %s\n", cudaGetErrorString(err));
        return -1;
    }
    
    err = cudaDeviceSynchronize();
    if (err != cudaSuccess) {
        printf("cudaDeviceSynchronize failed: %s\n", cudaGetErrorString(err));
        return -1;
    }

    cudaMemcpy(a, da, N*sizeof(int), cudaMemcpyDeviceToHost);

    for (size_t i = 0; i < N; i++)
    {
        std::cout << a[i] << " ";
    }
    std::cout << "\n";
}
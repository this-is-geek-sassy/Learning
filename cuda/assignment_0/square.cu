#include <bits/stdc++.h>
#include <cuda.h>

__global__ void sq_fun(int *dv_arr) {
    dv_arr[threadIdx.x] = dv_arr[threadIdx.x] * dv_arr[threadIdx.x];
    // std::cout << "printing from gpu: " << dv_arr[threadIdx.x] << std::endl;
    // printf("Hello from GPU\n");
    // printf("printing from gpu: %i \n", dv_arr[threadIdx.x]);
}

int main() {

    int N, *div_array;
    
    std::cin >> N;

    int v[N];
    for (size_t i = 0; i < N; i++) {
        std::cin >> v[i];
    }
    

    cudaMalloc(&div_array, N * sizeof(int));
    cudaMemcpy(div_array, v, N*sizeof(int), cudaMemcpyHostToDevice);
    sq_fun<<<1, N>>>(div_array);
    // cudaDeviceSynchronize();
    cudaMemcpy(v, div_array, N*sizeof(int), cudaMemcpyDeviceToHost);
    // o/p from cpu:
    std::cout << "O/p after sqauring:\n";
    for (size_t i = 0; i < N; i++)
    {
        std::cout << v[i] << " ";
    }
    std::cout << std::endl;
}
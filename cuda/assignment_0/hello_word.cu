#include <bits/stdc++.h>
#include <cuda.h>

__global__ void kernel() {
    printf("Hello, World from GPU!\n");
}

int main() {
    kernel<<<1, 1>>>();
    cudaDeviceSynchronize();
    return 0;
}
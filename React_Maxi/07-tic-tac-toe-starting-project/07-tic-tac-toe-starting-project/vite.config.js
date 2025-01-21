import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  server: {
    // Ensure HMR is enabled
    hmr: true,
    watch: {
      usePolling: true,
    },
  },
})

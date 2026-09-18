import path from 'node:path';
import { fileURLToPath } from 'node:url';

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

export default {
  mode: 'development',
  entry: './src/index.html',
  experiments: {
    html: true,
  },
  devtool: 'inline-source-map',
  devServer: {
    static: './dist',
  },
  output: {
    filename: '[name].bundle.js',
    htmlFilename: '[name].html',
    path: path.resolve(__dirname, 'dist'),
    clean: true,
  },
  optimization: {
    runtimeChunk: 'single',
  },
  watch: true,
  watchOptions: {
    aggregateTimeout: 600, 
    poll: 1000, // Check for changes every second
    ignored: /node_modules/, 
    followSymlinks: true, // Follow symlinks 
    stdin: true, // Watch for stdin changes
      
  },
}; 
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
  output: {
    filename: '[name].bundle.js',
    htmlFilename: '[name].html',
    path: path.resolve(__dirname, 'dist'),
    clean: true,
  },
};
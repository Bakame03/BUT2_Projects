import { merge } from 'webpack-merge'
import commun from './webpack.common.js'
import 'dotenv/config'; 

export default merge(commun, {
  mode: 'development',
  devtool: 'eval-source-map',
  output: {
    filename: 'js/[name].js',
    cssFilename: 'css/[name].css'
  },
  devServer: {
    port: 8080,
    open: true,
    hot: true,
    watchFiles: ['src/**/*.html']
  }
})
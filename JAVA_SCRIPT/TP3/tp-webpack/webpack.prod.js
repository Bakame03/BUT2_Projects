import { merge } from 'webpack-merge'
import commun from './webpack.common.js'

export default merge(commun, {
  mode: 'production',
  devtool: 'source-map',
  output: {
    filename: 'js/[name].[contenthash].js',
    cssFilename: 'css/[name].[contenthash].css'
  }
})
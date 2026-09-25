import path from 'node:path'
import HtmlWebpackPlugin from 'html-webpack-plugin'
import Dotenv  from 'dotenv-webpack' 

export default {
  entry: './src/index.js',
  output: {
    path: path.resolve(import.meta.dirname, 'dist'),
    clean: true
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: './src/index.html'
    }),
    new Dotenv()
  ],
  module: {
    rules: [
      {
        test: /\.js$/i,
        exclude: /node_modules/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: ['@babel/preset-env']
          }
        }
      },
      {
        test: /\.s[ac]ss$/i,
        type: "css/auto",
        use: [
          {
            loader: "sass-loader",
            options: {
              sassOptions: {
                quietDeps: true
              }
            }
          },
        ],
      },
      {
        test: /\.tpl\.html$/i,
        type: 'asset/source'
      },
      {
        test: /\.(png|jpe?g|gif|svg|webp)$/i,
        type: 'asset/resource',
        generator: {
          filename: 'images/[name].[contenthash][ext]'
        }
      },
      {
        test: /\.(woff2?|ttf|otf|eot)$/i,
        type: 'asset/resource',
        generator: {
          filename: 'fonts/[name].[contenthash][ext]'
        }
      }
    ]
  },
  experiments: {
    css: true,
  }
}
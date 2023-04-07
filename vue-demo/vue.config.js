module.exports = {
    devServer: {
        disableHostCheck: true,
        host: "localhost",
        port: 8888,
        proxy: {
            '/api': {
                target: "http://localhost:8080",
                changeOrigin: true,
                pathRewrite: {
                    '^/api':''
                }
            }
        }
    }
};
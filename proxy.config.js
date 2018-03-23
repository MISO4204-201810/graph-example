const PROXY_CONFIG = [
    {
        context: [
            "/platform/api",
            "/api"
        ],
        "target": "http://localhost:5000/",
        "secure": false,
        "pathRewrite": {
            "^/api": "/api",
            "^/platform/api": "/platform/api"
        },
        "logLevel": "debug",
        "bypass": function (req, res, proxyOptions) {
            if (req.headers.accept.indexOf("html") !== -1) {
                console.log("Skipping proxy for browser request.");
                return "/index.html";
            }
            req.headers["X-Custom-Header"] = "yes";
        }
    }
];

module.exports = PROXY_CONFIG;

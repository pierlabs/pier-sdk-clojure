(ns pier-sdk-clojure.api.token
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn callback-using-post-with-http-info
  "/api/tokens/callback"
  [body-access-token ]
  (call-api "/api/tokens/callback" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body-access-token
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn callback-using-post
  "/api/tokens/callback"
  [body-access-token ]
  (:data (callback-using-post-with-http-info body-access-token)))

(defn validar-using-post-with-http-info
  "/api/tokens/validar"
  [body-access-token ]
  (call-api "/api/tokens/validar" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    body-access-token
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["access_token"]}))

(defn validar-using-post
  "/api/tokens/validar"
  [body-access-token ]
  (:data (validar-using-post-with-http-info body-access-token)))

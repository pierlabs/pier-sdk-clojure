(ns pier-sdk-clojure.api.faq
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn adicionar-using-post-with-http-info
  "Adiciona uma nova FAQ
  Adiciona uma nova FAQ"
  ([pergunta resposta ] (adicionar-using-post-with-http-info pergunta resposta nil))
  ([pergunta resposta {:keys [relevancia plataforma categoria status ]}]
   (call-api "/api/faqs" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn adicionar-using-post
  "Adiciona uma nova FAQ
  Adiciona uma nova FAQ"
  ([pergunta resposta ] (adicionar-using-post pergunta resposta nil))
  ([pergunta resposta optional-params]
   (:data (adicionar-using-post-with-http-info pergunta resposta optional-params))))

(defn alterar-using-put3-with-http-info
  "Alterar FAQ
  Alterar FAQ"
  ([id pergunta resposta ] (alterar-using-put3-with-http-info id pergunta resposta nil))
  ([id pergunta resposta {:keys [relevancia plataforma categoria status ]}]
   (call-api "/api/faqs/{id}" :put
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn alterar-using-put3
  "Alterar FAQ
  Alterar FAQ"
  ([id pergunta resposta ] (alterar-using-put3 id pergunta resposta nil))
  ([id pergunta resposta optional-params]
   (:data (alterar-using-put3-with-http-info id pergunta resposta optional-params))))

(defn consultar-using-get10-with-http-info
  "Consultar FAQ por id
  Consulta os detalhes de uma determinada FAQ"
  [id ]
  (call-api "/api/faqs/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get10
  "Consultar FAQ por id
  Consulta os detalhes de uma determinada FAQ"
  [id ]
  (:data (consultar-using-get10-with-http-info id)))

(defn listar-using-get13-with-http-info
  "Lista FAQs
  Lista todas as FAQs"
  ([] (listar-using-get13-with-http-info nil))
  ([{:keys [sort page limit id-faq pergunta resposta relevancia plataforma categoria status ]}]
   (call-api "/api/faqs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idFaq" id-faq "pergunta" pergunta "resposta" resposta "relevancia" relevancia "plataforma" plataforma "categoria" categoria "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get13
  "Lista FAQs
  Lista todas as FAQs"
  ([] (listar-using-get13 nil))
  ([optional-params]
   (:data (listar-using-get13-with-http-info optional-params))))

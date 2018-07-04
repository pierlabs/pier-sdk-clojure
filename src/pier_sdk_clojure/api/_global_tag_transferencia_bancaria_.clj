(ns pier-sdk-clojure.api.-global-tag-transferencia-bancaria-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn atualizar-using-put1-with-http-info
  "{{{conta_bancaria_resource_atualizar}}}
  {{{conta_bancaria_resource_atualizar_notes}}}"
  [id update ]
  (call-api "/api/contas-bancarias-portador/{id}" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    update
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn atualizar-using-put1
  "{{{conta_bancaria_resource_atualizar}}}
  {{{conta_bancaria_resource_atualizar_notes}}}"
  [id update ]
  (:data (atualizar-using-put1-with-http-info id update)))

(defn cancelar-transferencia-credito-conta-bancaria-using-post-with-http-info
  "{{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria}}}
  {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria_notes}}}"
  [id-transferencia ]
  (call-api "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/cancelar" :post
            {:path-params   {"idTransferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-transferencia-credito-conta-bancaria-using-post
  "{{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria}}}
  {{{transferencia_bancaria_resource_cancelar_transferencia_credito_conta_bancaria_notes}}}"
  [id-transferencia ]
  (:data (cancelar-transferencia-credito-conta-bancaria-using-post-with-http-info id-transferencia)))

(defn confirmar-transferencia-credito-conta-bancaria-using-post-with-http-info
  "{{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria}}}
  {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria_notes}}}"
  [id-transferencia ]
  (call-api "/api/transferencias-creditos-contas-bancarias/{idTransferencia}/confirmar" :post
            {:path-params   {"idTransferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn confirmar-transferencia-credito-conta-bancaria-using-post
  "{{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria}}}
  {{{transferencia_bancaria_resource_confirmar_transferencia_credito_conta_bancaria_notes}}}"
  [id-transferencia ]
  (:data (confirmar-transferencia-credito-conta-bancaria-using-post-with-http-info id-transferencia)))

(defn consultar-transferencia-bancaria-using-get-with-http-info
  "{{{transferencia_bancaria_resource_consultar_transferencia_bancaria}}}
  {{{transferencia_bancaria_resource_consultar_transferencia_bancaria_notes}}}"
  [id-transferencia ]
  (call-api "/api/transferencias-creditos-contas-bancarias/{idTransferencia}" :get
            {:path-params   {"idTransferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-transferencia-bancaria-using-get
  "{{{transferencia_bancaria_resource_consultar_transferencia_bancaria}}}
  {{{transferencia_bancaria_resource_consultar_transferencia_bancaria_notes}}}"
  [id-transferencia ]
  (:data (consultar-transferencia-bancaria-using-get-with-http-info id-transferencia)))

(defn consultar-using-get12-with-http-info
  "{{{conta_bancaria_resource_consultar}}}
  {{{conta_bancaria_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/contas-bancarias-portador/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get12
  "{{{conta_bancaria_resource_consultar}}}
  {{{conta_bancaria_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get12-with-http-info id)))

(defn consultar-using-get47-with-http-info
  "{{{transferencia_bancaria_resource_consultar}}}
  {{{transferencia_bancaria_resource_consultar_notes}}}"
  ([id id-transferencia ] (consultar-using-get47-with-http-info id id-transferencia nil))
  ([id id-transferencia {:keys [id-conta-bancaria-destino ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias/{id_transferencia}" :get
             {:path-params   {"id" id "id_transferencia" id-transferencia }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-using-get47
  "{{{transferencia_bancaria_resource_consultar}}}
  {{{transferencia_bancaria_resource_consultar_notes}}}"
  ([id id-transferencia ] (consultar-using-get47 id id-transferencia nil))
  ([id id-transferencia optional-params]
   (:data (consultar-using-get47-with-http-info id id-transferencia optional-params))))

(defn listar-transferencia-bancaria-using-get-with-http-info
  "{{{transferencia_bancaria_resource_listar_transferencia_bancaria}}}
  {{{transferencia_bancaria_resource_listar_transferencia_bancaria_notes}}}"
  ([] (listar-transferencia-bancaria-using-get-with-http-info nil))
  ([{:keys [sort page limit id-conta data-solicitacao-inicial data-solicitacao-final status ]}]
   (call-api "/api/transferencias-creditos-contas-bancarias" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idConta" id-conta "dataSolicitacaoInicial" data-solicitacao-inicial "dataSolicitacaoFinal" data-solicitacao-final "status" status }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-transferencia-bancaria-using-get
  "{{{transferencia_bancaria_resource_listar_transferencia_bancaria}}}
  {{{transferencia_bancaria_resource_listar_transferencia_bancaria_notes}}}"
  ([] (listar-transferencia-bancaria-using-get nil))
  ([optional-params]
   (:data (listar-transferencia-bancaria-using-get-with-http-info optional-params))))

(defn listar-using-get16-with-http-info
  "{{{conta_bancaria_resource_listar}}}
  {{{conta_bancaria_resource_listar_notes}}}"
  ([] (listar-using-get16-with-http-info nil))
  ([{:keys [id-conta nome-agencia banco numero-agencia numero-conta flag-ativo flag-conta-origem-doc id-pessoa-fisica favorecido numero-receira-federal sort page limit ]}]
   (call-api "/api/contas-bancarias-portador" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "nomeAgencia" nome-agencia "banco" banco "numeroAgencia" numero-agencia "numeroConta" numero-conta "flagAtivo" flag-ativo "flagContaOrigemDoc" flag-conta-origem-doc "idPessoaFisica" id-pessoa-fisica "favorecido" favorecido "numeroReceiraFederal" numero-receira-federal "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get16
  "{{{conta_bancaria_resource_listar}}}
  {{{conta_bancaria_resource_listar_notes}}}"
  ([] (listar-using-get16 nil))
  ([optional-params]
   (:data (listar-using-get16-with-http-info optional-params))))

(defn listar-using-get59-with-http-info
  "{{{transferencia_bancaria_resource_listar}}}
  {{{transferencia_bancaria_resource_listar_notes}}}"
  ([id ] (listar-using-get59-with-http-info id nil))
  ([id {:keys [id-conta-bancaria-destino sort page limit ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"id_conta_bancaria_destino" id-conta-bancaria-destino "sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get59
  "{{{transferencia_bancaria_resource_listar}}}
  {{{transferencia_bancaria_resource_listar_notes}}}"
  ([id ] (listar-using-get59 id nil))
  ([id optional-params]
   (:data (listar-using-get59-with-http-info id optional-params))))

(defn salvar-using-post7-with-http-info
  "{{{conta_bancaria_resource_salvar}}}
  {{{conta_bancaria_resource_salvar_notes}}}"
  [persist ]
  (call-api "/api/contas-bancarias-portador" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post7
  "{{{conta_bancaria_resource_salvar}}}
  {{{conta_bancaria_resource_salvar_notes}}}"
  [persist ]
  (:data (salvar-using-post7-with-http-info persist)))

(defn simular-transferencia-bancaria-using-post-with-http-info
  "{{{transferencia_bancaria_resource_simular_transferencia_bancaria}}}
  {{{transferencia_bancaria_resource_simular_transferencia_bancaria_notes}}}"
  [request ]
  (call-api "/api/simular-transferencias-creditos-contas-bancarias" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-transferencia-bancaria-using-post
  "{{{transferencia_bancaria_resource_simular_transferencia_bancaria}}}
  {{{transferencia_bancaria_resource_simular_transferencia_bancaria_notes}}}"
  [request ]
  (:data (simular-transferencia-bancaria-using-post-with-http-info request)))

(defn transferencia-credito-conta-bancaria-using-post-with-http-info
  "{{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria}}}
  {{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria_notes}}}"
  [persist ]
  (call-api "/api/transferencias-creditos-contas-bancarias" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transferencia-credito-conta-bancaria-using-post
  "{{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria}}}
  {{{transferencia_bancaria_resource_transferencia_credito_conta_bancaria_notes}}}"
  [persist ]
  (:data (transferencia-credito-conta-bancaria-using-post-with-http-info persist)))

(defn transferir-using-post-with-http-info
  "{{{transferencia_bancaria_resource_transferir}}}
  {{{transferencia_bancaria_resource_transferir_notes}}}"
  [id transferencia-bancaria-persist ]
  (call-api "/api/contas/{id}/transferencias-creditos-contas-bancarias" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    transferencia-bancaria-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transferir-using-post
  "{{{transferencia_bancaria_resource_transferir}}}
  {{{transferencia_bancaria_resource_transferir_notes}}}"
  [id transferencia-bancaria-persist ]
  (:data (transferir-using-post-with-http-info id transferencia-bancaria-persist)))
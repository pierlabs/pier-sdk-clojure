(ns pier-sdk-clojure.api.-global-tag-conta-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn ajustar-conta-using-post1-with-http-info
  "{{{conta_resource_ajustar_conta}}}
  {{{conta_resource_ajustar_conta_notes}}}"
  ([id id-tipo-ajuste data-ajuste valor-ajuste ] (ajustar-conta-using-post1-with-http-info id id-tipo-ajuste data-ajuste valor-ajuste nil))
  ([id id-tipo-ajuste data-ajuste valor-ajuste {:keys [identificador-externo id-transacao-original ]}]
   (call-api "/api/contas/{id}/ajustes-financeiros" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"idTipoAjuste" id-tipo-ajuste "dataAjuste" data-ajuste "valorAjuste" valor-ajuste "identificadorExterno" identificador-externo "idTransacaoOriginal" id-transacao-original }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn ajustar-conta-using-post1
  "{{{conta_resource_ajustar_conta}}}
  {{{conta_resource_ajustar_conta_notes}}}"
  ([id id-tipo-ajuste data-ajuste valor-ajuste ] (ajustar-conta-using-post1 id id-tipo-ajuste data-ajuste valor-ajuste nil))
  ([id id-tipo-ajuste data-ajuste valor-ajuste optional-params]
   (:data (ajustar-conta-using-post1-with-http-info id id-tipo-ajuste data-ajuste valor-ajuste optional-params))))

(defn alterar-produto-using-post-with-http-info
  "{{{conta_resource_alterar_produto}}}
  {{{conta_resource_alterar_produto_notes}}}"
  [id request ]
  (call-api "/api/contas/{id}/alterar-produto" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-produto-using-post
  "{{{conta_resource_alterar_produto}}}
  {{{conta_resource_alterar_produto_notes}}}"
  [id request ]
  (:data (alterar-produto-using-post-with-http-info id request)))

(defn alterar-titular-using-post-with-http-info
  "{{{conta_resource_alterar_titular}}}
  {{{conta_resource_alterar_titular_notes}}}"
  [id id-pessoa ]
  (call-api "/api/contas/{id}/alterar-titular" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_pessoa" id-pessoa }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-titular-using-post
  "{{{conta_resource_alterar_titular}}}
  {{{conta_resource_alterar_titular_notes}}}"
  [id id-pessoa ]
  (:data (alterar-titular-using-post-with-http-info id id-pessoa)))

(defn alterar-vencimento-using-put-with-http-info
  "{{{conta_resource_alterar_vencimento}}}
  {{{conta_resource_alterar_vencimento_notes}}}"
  [id novo-dia-vencimento ]
  (call-api "/api/contas/{id}/alterar-vencimento" :put
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"novo_dia_vencimento" novo-dia-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn alterar-vencimento-using-put
  "{{{conta_resource_alterar_vencimento}}}
  {{{conta_resource_alterar_vencimento_notes}}}"
  [id novo-dia-vencimento ]
  (:data (alterar-vencimento-using-put-with-http-info id novo-dia-vencimento)))

(defn ativar-anuidade-using-post-with-http-info
  "{{{conta_resource_ativar_anuidade}}}
  {{{conta_resource_ativar_anuidade_notes}}}"
  ([id id-anuidade ] (ativar-anuidade-using-post-with-http-info id id-anuidade nil))
  ([id id-anuidade {:keys [sort page limit ddd celular id-operadora id-origem-comercial ]}]
   (call-api "/api/contas/{id}/atribuir-anuidade" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idAnuidade" id-anuidade "DDD" ddd "celular" celular "idOperadora" id-operadora "idOrigemComercial" id-origem-comercial }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn ativar-anuidade-using-post
  "{{{conta_resource_ativar_anuidade}}}
  {{{conta_resource_ativar_anuidade_notes}}}"
  ([id id-anuidade ] (ativar-anuidade-using-post id id-anuidade nil))
  ([id id-anuidade optional-params]
   (:data (ativar-anuidade-using-post-with-http-info id id-anuidade optional-params))))

(defn ativar-envio-fatura-email-using-post-with-http-info
  "{{{conta_resource_ativar_envio_fatura_email}}}
  {{{conta_resource_ativar_envio_fatura_email_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/ativar-fatura-email" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn ativar-envio-fatura-email-using-post
  "{{{conta_resource_ativar_envio_fatura_email}}}
  {{{conta_resource_ativar_envio_fatura_email_notes}}}"
  [id ]
  (:data (ativar-envio-fatura-email-using-post-with-http-info id)))

(defn bloquear-using-post1-with-http-info
  "{{{conta_resource_bloquear}}}
  {{{conta_resource_bloquear_notes}}}"
  [id id-status ]
  (call-api "/api/contas/{id}/bloquear" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status" id-status }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn bloquear-using-post1
  "{{{conta_resource_bloquear}}}
  {{{conta_resource_bloquear_notes}}}"
  [id id-status ]
  (:data (bloquear-using-post1-with-http-info id id-status)))

(defn cadastrar-using-post-with-http-info
  "{{{aderir_pagamento_sabado_recurso_cadastrar}}}
  {{{aderir_pagamento_sabado_recurso_cadastrar_notas}}}"
  [id ]
  (call-api "/api/adesoes-pagamentos-sabados" :post
            {:path-params   {}
             :header-params {}
             :query-params  {"id" id }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cadastrar-using-post
  "{{{aderir_pagamento_sabado_recurso_cadastrar}}}
  {{{aderir_pagamento_sabado_recurso_cadastrar_notas}}}"
  [id ]
  (:data (cadastrar-using-post-with-http-info id)))

(defn cancelar-using-post1-with-http-info
  "{{{conta_resource_cancelar}}}
  {{{conta_resource_cancelar_notes}}}"
  [id id-status ]
  (call-api "/api/contas/{id}/cancelar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_status" id-status }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn cancelar-using-post1
  "{{{conta_resource_cancelar}}}
  {{{conta_resource_cancelar_notes}}}"
  [id id-status ]
  (:data (cancelar-using-post1-with-http-info id id-status)))

(defn consultar-beneficio-pagamento-atraso-using-get-with-http-info
  "{{{conta_resource_consultar_beneficio_pagamento_atraso}}}
  {{{conta_resource_consultar_beneficio_pagamento_atraso_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/consultar-beneficio-pagamento-atraso" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-beneficio-pagamento-atraso-using-get
  "{{{conta_resource_consultar_beneficio_pagamento_atraso}}}
  {{{conta_resource_consultar_beneficio_pagamento_atraso_notes}}}"
  [id ]
  (:data (consultar-beneficio-pagamento-atraso-using-get-with-http-info id)))

(defn consultar-boleto-emitido-using-get-with-http-info
  "{{{conta_resource_consultar_boleto_emitido}}}
  {{{conta_resource_consultar_boleto_emitido_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/consultar-dados-pagamento-fatura" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-boleto-emitido-using-get
  "{{{conta_resource_consultar_boleto_emitido}}}
  {{{conta_resource_consultar_boleto_emitido_notes}}}"
  [id ]
  (:data (consultar-boleto-emitido-using-get-with-http-info id)))

(defn consultar-divida-atualizada-cliente-using-get-with-http-info
  "{{{conta_resource_consultar_divida_atualizada_cliente}}}
  {{{conta_resource_consultar_divida_atualizada_cliente_notes}}}"
  ([id ] (consultar-divida-atualizada-cliente-using-get-with-http-info id nil))
  ([id {:keys [sort page limit data-vencimento id-escritorio-cobranca ]}]
   (call-api "/api/contas/{id}/recuperar-divida-atualizada" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento "idEscritorioCobranca" id-escritorio-cobranca }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-divida-atualizada-cliente-using-get
  "{{{conta_resource_consultar_divida_atualizada_cliente}}}
  {{{conta_resource_consultar_divida_atualizada_cliente_notes}}}"
  ([id ] (consultar-divida-atualizada-cliente-using-get id nil))
  ([id optional-params]
   (:data (consultar-divida-atualizada-cliente-using-get-with-http-info id optional-params))))

(defn consultar-taxas-tarifas-using-get-with-http-info
  "{{{conta_resource_consultar_taxas_tarifas}}}
  {{{conta_resource_consultar_taxas_tarifas_notes}}}"
  ([id ] (consultar-taxas-tarifas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/consultar-taxas-tarifas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn consultar-taxas-tarifas-using-get
  "{{{conta_resource_consultar_taxas_tarifas}}}
  {{{conta_resource_consultar_taxas_tarifas_notes}}}"
  ([id ] (consultar-taxas-tarifas-using-get id nil))
  ([id optional-params]
   (:data (consultar-taxas-tarifas-using-get-with-http-info id optional-params))))

(defn consultar-using-get1-with-http-info
  "{{{aderir_pagamento_sabado_recurso_consultar}}}
  {{{aderir_pagamento_sabado_recurso_consultar_notas}}}"
  [id data-vencimento ]
  (call-api "/api/adesoes-pagamentos-sabados" :get
            {:path-params   {}
             :header-params {}
             :query-params  {"id" id "dataVencimento" data-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get1
  "{{{aderir_pagamento_sabado_recurso_consultar}}}
  {{{aderir_pagamento_sabado_recurso_consultar_notas}}}"
  [id data-vencimento ]
  (:data (consultar-using-get1-with-http-info id data-vencimento)))

(defn consultar-using-get16-with-http-info
  "{{{conta_resource_consultar}}}
  {{{conta_resource_consultar_notes}}}"
  [id ]
  (call-api "/api/contas/{id}" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get16
  "{{{conta_resource_consultar}}}
  {{{conta_resource_consultar_notes}}}"
  [id ]
  (:data (consultar-using-get16-with-http-info id)))

(defn consultar-using-get51-with-http-info
  "{{{transferencia_resource_consultar}}}
  {{{transferencia_resource_consultar_notes}}}"
  [id id-transferencia ]
  (call-api "/api/contas/{id}/transferencias-creditos-cartoes/{id_transferencia}" :get
            {:path-params   {"id" id "id_transferencia" id-transferencia }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-using-get51
  "{{{transferencia_resource_consultar}}}
  {{{transferencia_resource_consultar_notes}}}"
  [id id-transferencia ]
  (:data (consultar-using-get51-with-http-info id id-transferencia)))

(defn criar-contas-multi-app-using-post-with-http-info
  "{{{conta_resource_cadastrar_conta_multiapp}}}
  {{{conta_resource_cadastrar_conta_multiapp_notes}}}"
  [conta-multi-app-persist ]
  (call-api "/api/contas/cadastrar-conta-multiapp" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    conta-multi-app-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn criar-contas-multi-app-using-post
  "{{{conta_resource_cadastrar_conta_multiapp}}}
  {{{conta_resource_cadastrar_conta_multiapp_notes}}}"
  [conta-multi-app-persist ]
  (:data (criar-contas-multi-app-using-post-with-http-info conta-multi-app-persist)))

(defn desativar-envio-fatura-email-using-post-with-http-info
  "{{{conta_resource_desativar_envio_fatura_email}}}
  {{{conta_resource_desativar_envio_fatura_email_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/desativar-fatura-email" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn desativar-envio-fatura-email-using-post
  "{{{conta_resource_desativar_envio_fatura_email}}}
  {{{conta_resource_desativar_envio_fatura_email_notes}}}"
  [id ]
  (:data (desativar-envio-fatura-email-using-post-with-http-info id)))

(defn gerar-boleto-recarga-using-post-with-http-info
  "{{{conta_resource_gerar_boleto_recarga}}}
  {{{conta_resource_gerar_boleto_recarga_notes}}}"
  [id valor data-vencimento ]
  (call-api "/api/contas/{id}/gerar-boleto-recarga" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"valor" valor "dataVencimento" data-vencimento }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-boleto-recarga-using-post
  "{{{conta_resource_gerar_boleto_recarga}}}
  {{{conta_resource_gerar_boleto_recarga_notes}}}"
  [id valor data-vencimento ]
  (:data (gerar-boleto-recarga-using-post-with-http-info id valor data-vencimento)))

(defn gerar-cartao-embossing-using-post-with-http-info
  "{{{conta_resource_gerar_cartao_embossing}}}
  {{{conta_resource_gerar_cartao_embossing_notes}}}"
  [id cartao-embossing-request ]
  (call-api "/api/contas/{id}/gerar-cartao-grafica" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    cartao-embossing-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-cartao-embossing-using-post
  "{{{conta_resource_gerar_cartao_embossing}}}
  {{{conta_resource_gerar_cartao_embossing_notes}}}"
  [id cartao-embossing-request ]
  (:data (gerar-cartao-embossing-using-post-with-http-info id cartao-embossing-request)))

(defn gerar-cartao-provisorio-using-post-with-http-info
  "{{{conta_resource_gerar_cartao_provisorio}}}
  {{{conta_resource_gerar_cartao_provisorio_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/gerar-cartao-provisorio" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-cartao-provisorio-using-post
  "{{{conta_resource_gerar_cartao_provisorio}}}
  {{{conta_resource_gerar_cartao_provisorio_notes}}}"
  [id ]
  (:data (gerar-cartao-provisorio-using-post-with-http-info id)))

(defn gerar-cartao-using-post-with-http-info
  "{{{conta_resource_gerar_cartao}}}
  {{{conta_resource_gerar_cartao_notes}}}"
  ([id id-pessoa ] (gerar-cartao-using-post-with-http-info id id-pessoa nil))
  ([id id-pessoa {:keys [id-tipo-plastico ]}]
   (call-api "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao" :post
             {:path-params   {"id" id "id_pessoa" id-pessoa }
              :header-params {}
              :query-params  {"id_tipo_plastico" id-tipo-plastico }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn gerar-cartao-using-post
  "{{{conta_resource_gerar_cartao}}}
  {{{conta_resource_gerar_cartao_notes}}}"
  ([id id-pessoa ] (gerar-cartao-using-post id id-pessoa nil))
  ([id id-pessoa optional-params]
   (:data (gerar-cartao-using-post-with-http-info id id-pessoa optional-params))))

(defn gerar-cartao-virtual-using-post-with-http-info
  "{{{conta_resource_gerar_cartao_virtual}}}
  {{{conta_resource_gerar_cartao_virtual_notes}}}"
  [id data-validade ]
  (call-api "/api/contas/{id}/gerar-cartao-virtual" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"dataValidade" data-validade }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn gerar-cartao-virtual-using-post
  "{{{conta_resource_gerar_cartao_virtual}}}
  {{{conta_resource_gerar_cartao_virtual_notes}}}"
  [id data-validade ]
  (:data (gerar-cartao-virtual-using-post-with-http-info id data-validade)))

(defn listar-historico-alteracoes-limites-using-get-with-http-info
  "{{{conta_resource_listar_historico_alteracoes_limites}}}
  {{{conta_resource_listar_historico_alteracoes_limites_notes}}}"
  ([id ] (listar-historico-alteracoes-limites-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/historicos-alteracoes-limites" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-alteracoes-limites-using-get
  "{{{conta_resource_listar_historico_alteracoes_limites}}}
  {{{conta_resource_listar_historico_alteracoes_limites_notes}}}"
  ([id ] (listar-historico-alteracoes-limites-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-alteracoes-limites-using-get-with-http-info id optional-params))))

(defn listar-historico-assessoria-using-get-with-http-info
  "{{{conta_resource_listar_historico_assessoria}}}
  {{{conta_resource_listar_historico_assessoria_notes}}}"
  ([id ] (listar-historico-assessoria-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/historicos-assessorias-cobranca" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-assessoria-using-get
  "{{{conta_resource_listar_historico_assessoria}}}
  {{{conta_resource_listar_historico_assessoria_notes}}}"
  ([id ] (listar-historico-assessoria-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-assessoria-using-get-with-http-info id optional-params))))

(defn listar-historico-atrasos-faturas-using-get-with-http-info
  "{{{conta_resource_listar_historico_atrasos_faturas}}}
  {{{conta_resource_listar_historico_atrasos_faturas_notes}}}"
  ([id ] (listar-historico-atrasos-faturas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/historicos-faturas-atrasos" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-historico-atrasos-faturas-using-get
  "{{{conta_resource_listar_historico_atrasos_faturas}}}
  {{{conta_resource_listar_historico_atrasos_faturas_notes}}}"
  ([id ] (listar-historico-atrasos-faturas-using-get id nil))
  ([id optional-params]
   (:data (listar-historico-atrasos-faturas-using-get-with-http-info id optional-params))))

(defn listar-nao-processadas-using-get-with-http-info
  "{{{transacoes_correntes_resource_listar_nao_processadas}}}
  {{{transacoes_correntes_resource_listar_nao_processadas_notes}}}"
  ([id ] (listar-nao-processadas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit data-inicio data-fim ]}]
   (call-api "/api/contas/{id}/transacoes/listar-nao-processadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataInicio" data-inicio "dataFim" data-fim }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-nao-processadas-using-get
  "{{{transacoes_correntes_resource_listar_nao_processadas}}}
  {{{transacoes_correntes_resource_listar_nao_processadas_notes}}}"
  ([id ] (listar-nao-processadas-using-get id nil))
  ([id optional-params]
   (:data (listar-nao-processadas-using-get-with-http-info id optional-params))))

(defn listar-processadas-using-get-with-http-info
  "{{{transacoes_correntes_resource_listar_processadas}}}
  {{{transacoes_correntes_resource_listar_processadas_notes}}}"
  ([id ] (listar-processadas-using-get-with-http-info id nil))
  ([id {:keys [sort page limit data-vencimento data-inicio data-fim id-tipo-transacao recupera-encargos ]}]
   (call-api "/api/contas/{id}/transacoes/listar-processadas" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento "dataInicio" data-inicio "dataFim" data-fim "idTipoTransacao" id-tipo-transacao "recuperaEncargos" recupera-encargos }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-processadas-using-get
  "{{{transacoes_correntes_resource_listar_processadas}}}
  {{{transacoes_correntes_resource_listar_processadas_notes}}}"
  ([id ] (listar-processadas-using-get id nil))
  ([id optional-params]
   (:data (listar-processadas-using-get-with-http-info id optional-params))))

(defn listar-using-get19-with-http-info
  "{{{conta_resource_listar}}}
  {{{conta_resource_listar_notes}}}"
  ([] (listar-using-get19-with-http-info nil))
  ([{:keys [sort page limit id-produto id-origem-comercial id-pessoa id-status-conta dia-vencimento melhor-dia-compra data-status-conta data-cadastro data-ultima-alteracao-vencimento ]}]
   (call-api "/api/contas" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idProduto" id-produto "idOrigemComercial" id-origem-comercial "idPessoa" id-pessoa "idStatusConta" id-status-conta "diaVencimento" dia-vencimento "melhorDiaCompra" melhor-dia-compra "dataStatusConta" data-status-conta "dataCadastro" data-cadastro "dataUltimaAlteracaoVencimento" data-ultima-alteracao-vencimento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get19
  "{{{conta_resource_listar}}}
  {{{conta_resource_listar_notes}}}"
  ([] (listar-using-get19 nil))
  ([optional-params]
   (:data (listar-using-get19-with-http-info optional-params))))

(defn listar-using-get61-with-http-info
  "{{{transacoes_correntes_resource_listar_nao_processadas_e_processadas}}}
  {{{transacoes_correntes_resource_listar_nao_processadas_e_processadas_notes}}}"
  ([id ] (listar-using-get61-with-http-info id nil))
  ([id {:keys [sort page limit data-vencimento data-inicio data-fim id-tipo-transacao ]}]
   (call-api "/api/contas/{id}/transacoes" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "dataVencimento" data-vencimento "dataInicio" data-inicio "dataFim" data-fim "idTipoTransacao" id-tipo-transacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get61
  "{{{transacoes_correntes_resource_listar_nao_processadas_e_processadas}}}
  {{{transacoes_correntes_resource_listar_nao_processadas_e_processadas_notes}}}"
  ([id ] (listar-using-get61 id nil))
  ([id optional-params]
   (:data (listar-using-get61-with-http-info id optional-params))))

(defn listar-using-get63-with-http-info
  "{{{transferencia_resource_listar}}}
  {{{transferencia_resource_listar_notes}}}"
  ([id ] (listar-using-get63-with-http-info id nil))
  ([id {:keys [sort page limit id-transferencia id-conta-origem id-conta-destino valor-transferencia data-transferencia ]}]
   (call-api "/api/contas/{id}/transferencias-creditos-cartoes" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idTransferencia" id-transferencia "idContaOrigem" id-conta-origem "idContaDestino" id-conta-destino "valorTransferencia" valor-transferencia "dataTransferencia" data-transferencia }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get63
  "{{{transferencia_resource_listar}}}
  {{{transferencia_resource_listar_notes}}}"
  ([id ] (listar-using-get63 id nil))
  ([id optional-params]
   (:data (listar-using-get63-with-http-info id optional-params))))

(defn reativar-using-post1-with-http-info
  "{{{conta_resource_reativar}}}
  {{{conta_resource_reativar_notes}}}"
  [id ]
  (call-api "/api/contas/{id}/reativar" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn reativar-using-post1
  "{{{conta_resource_reativar}}}
  {{{conta_resource_reativar_notes}}}"
  [id ]
  (:data (reativar-using-post1-with-http-info id)))

(defn salvar-using-post9-with-http-info
  "{{{conta_resource_salvar}}}
  {{{conta_resource_salvar_notes}}}"
  [conta-persist ]
  (call-api "/api/contas" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    conta-persist
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn salvar-using-post9
  "{{{conta_resource_salvar}}}
  {{{conta_resource_salvar_notes}}}"
  [conta-persist ]
  (:data (salvar-using-post9-with-http-info conta-persist)))

(defn simular-emprestimo-financiamento-using-post-with-http-info
  "{{{financiamento_resource_simular_emprestimo_financiamento}}}
  {{{financiamento_resource_simular_emprestimo_financiamento_notes}}}"
  [id request ]
  (call-api "/api/contas/{id}/simular-emprestimos-financiamentos" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-emprestimo-financiamento-using-post
  "{{{financiamento_resource_simular_emprestimo_financiamento}}}
  {{{financiamento_resource_simular_emprestimo_financiamento_notes}}}"
  [id request ]
  (:data (simular-emprestimo-financiamento-using-post-with-http-info id request)))

(defn transacoes-using-get-with-http-info
  "{{{conta_resource_transacoes}}}
  {{{conta_resource_transacoes_notes}}}"
  ([id ] (transacoes-using-get-with-http-info id nil))
  ([id {:keys [sort page limit ]}]
   (call-api "/api/contas/{id}/timeline" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn transacoes-using-get
  "{{{conta_resource_transacoes}}}
  {{{conta_resource_transacoes_notes}}}"
  ([id ] (transacoes-using-get id nil))
  ([id optional-params]
   (:data (transacoes-using-get-with-http-info id optional-params))))

(defn transferir-using-post1-with-http-info
  "{{{transferencia_resource_transferir}}}
  {{{transferencia_resource_transferir_notes}}}"
  [id id-conta-destino valor-transferencia ]
  (call-api "/api/contas/{id}/transferencias-creditos-cartoes" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"id_conta_destino" id-conta-destino "valor_transferencia" valor-transferencia }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn transferir-using-post1
  "{{{transferencia_resource_transferir}}}
  {{{transferencia_resource_transferir_notes}}}"
  [id id-conta-destino valor-transferencia ]
  (:data (transferir-using-post1-with-http-info id id-conta-destino valor-transferencia)))

(ns helda-owgame.handlers.system)

(defn new-system [config]
  (component/map->SystemMap
    {
     :clients {
        :models {}
        :worlds {}
        :entities {}
     }
     :http (component/using
             (http-kit/create
               (:http config)
               {
                 :fn
                 (if (:dev-mode? config)
                    ; re-create handler on every request
                    (fn [system] #((cqrs/create system) %))
                    cqrs/create
                    )
                  }
                )
             [:clients])
      }
    )
  )

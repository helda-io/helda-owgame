(ns helda-owgame.core
  (:require [com.stuartsierra.component :as component]
            [reloaded.repl :refer [set-init! go]])
  (:gen-class)
  )

(defn -main [& [port]]
  (let [port (or port 3001)]
    (require 'helda-owgame.handlers.system)
    (set-init! #((resolve 'helda-owgame.handlers.system/new-system)
      {:http {:port port}})
      )
    (go)
    )
  )

(ns user
  (:require
    [reloaded.repl :refer [system init start stop go reset]]
    [helda-owgame.handlers.system :refer [new-system]]
    )
  )

(reloaded.repl/set-init! #(new-system {:http {:port 3001}, :dev-mode? true}))

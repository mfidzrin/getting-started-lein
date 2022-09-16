(ns getting-started-lein.core
  (:gen-class))

(defn say-hi [name]
  (str "Hi, " name))

(defn -main
  "I don't do a whole lot ... yet."
  [& _args]
  (println (say-hi "Fidzrin")))

(ns zero.double-trouble)

(defn double-trouble [num]
  (* num 2))

(defn -main []
  (println (double-trouble 5))
  (println (double-trouble 10)))

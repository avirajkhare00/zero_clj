(ns zero.hello)

(defn greet [name]
  (println (str "Hello, " name "!")))

(defn -main []
  (greet "Alice")
  (greet "Bob"))

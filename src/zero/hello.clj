(ns zero.hello)

(defn greet [name]
  (str "Hello, " name "!"))

(defn -main []
  (greet "Alice")
  (greet "Bob"))

(ns zero.hello-test
  (:require [clojure.test :refer [deftest is testing]]
            [zero.hello :refer [greet]]))

(deftest a-test
  (testing "it should print correct name" (is (= (greet "Aviraj") "Hello, Aviraj!"))))

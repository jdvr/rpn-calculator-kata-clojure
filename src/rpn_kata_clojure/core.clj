(ns rpn-kata-clojure.core
  (:gen-class))

(defn- is-operation? [e]
  (or (= '+ e) (= '/ e) (= '* e) (= '- e)))

(def penultimate (comp second reverse))

(def operation-fn {
                   '+ +
                   '- -
                   '* *
                   '/ /
                   })

(defn rpn [expession]
  (reduce (fn [stack e]
            (if (is-operation? e)
              (conj (pop (pop stack)) (apply (operation-fn  e)  [(penultimate stack) (last stack)]))
              (conj stack e))
            )
          [] expession))

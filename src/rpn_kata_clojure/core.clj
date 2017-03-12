(ns rpn-kata-clojure.core
  (:gen-class))

(defn- is-operation? [e]
  (or (= '+ e) (= '/ e) (= '* e) (= '- e)))

(def operation-fn {
                   '+ +
                   '- -
                   '* *
                   '/ /
                   })

(defn rpn [expession]
  (reduce (fn [acc e]
            (if (is-operation? e)
              (conj (pop (pop acc)) (apply (operation-fn  e)  [(nth (reverse acc) 1) (last acc)]))
              (conj acc e))
            )
          [] expession))

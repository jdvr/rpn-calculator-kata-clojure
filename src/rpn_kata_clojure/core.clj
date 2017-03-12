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
              (conj [] (apply (operation-fn  e) acc))
              (conj acc e))
            )
          [] expession))

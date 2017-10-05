(ns clojure-fabric.utils)

(defn indices [pred col]
  (keep-indexed #(when (pred %2) %1) col))

(defn removev-index [v idx]
  (if (= idx 0)
    (subvec v 1)
    (into (subvec v 0 idx) (subvec v (inc idx)))))

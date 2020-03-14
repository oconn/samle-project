(ns project.core
  (:require [clj-http.client :as client]))

(def hn-story-url
  "https://hacker-news.firebaseio.com/v0/item/8863.json?print=pretty")

(comment
  ;; Evaluate to see in buffer
  (let [hn-story (client/get hn-story-url)]
    (clojure.pprint/pprint hn-story))

  )

(ns pwa-clojure.views
  (:require [hiccup.page :refer [html5 include-js]]
            [pwa-clojure.components :as components]
            [rum.core :as rum]))

(defn home-page [_]
  {:body
   (html5
    [:head
     [:title "Hello World"]]
    [:body
     [:div#container
      (rum/render-html (components/pwa-component {:handler :home-page
                                                  :data {:title "Hello, World!"}}))]
     (include-js "/js/main.js")])})

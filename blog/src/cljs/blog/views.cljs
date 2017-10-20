(ns blog.views
  (:require [re-frame.core :as re-frame]
            [reagent.core :as r]))

(defn main-panel []
  (let [name (re-frame/subscribe [:name])]
    (fn []
      [:div
       [:nav {:class "navbar navbar-inverse"}
        [:div {:class "container-fluid"}
         [:div {:class "navbar-header"}
          [:text {:class "navbar-brand"} "RATEDRWORLD"]]
         [:div
          [:ul {:class "nav navbar-nav"}
           [:li {:class "active"}
            [:a {:href "#"} "HOME"]]]]]]
       [:div {:class "flex-css"}
        [:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]
        #_[:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]
        #_[:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]
        #_[:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]
        #_[:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]
        #_[:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]
        #_[:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]
        #_[:div {:class "card"}
         [:text {:class "text-css"} "My first blog article"]]]])))

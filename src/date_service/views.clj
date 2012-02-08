(ns date-service.views
  (:use hiccup.core))

(defhtml layout [title content]
  [:html
   [:head [:title (str "date.io: " title)]]
   [:body [:div.wrap
           [:h1 "date.io"]
           [:h2 title]
           [:div.content content]]]])

(defhtml plain-time-partial [date]
  [:p (str date)])

(defn plain-time [time]
  (layout "Current UTC Time" (plain-time-partial time)))


(ns clojure.realworld.article.interface
  (:require [clojure.realworld.article.core :as core]
            [clojure.realworld.article.spec :as spec]))

(def create-article spec/create-article)

(def update-article spec/update-article)

(defn article [auth-user slug]
  (core/article auth-user slug))

(defn create-article! [auth-user article-input]
  (core/create-article! auth-user article-input))

(defn update-article! [auth-user slug article-input]
  (core/update-article! auth-user slug article-input))

(defn delete-article! [auth-user slug]
  (core/delete-article! auth-user slug))

(defn favorite-article! [auth-user slug]
  (core/favorite-article! auth-user slug))

(defn unfavorite-article! [auth-user slug]
  (core/unfavorite-article! auth-user slug))

(defn feed [auth-user limit offset]
  (core/feed auth-user limit offset))

(defn articles [auth-user limit offset author tag favorited]
  (core/articles auth-user limit offset author tag favorited))

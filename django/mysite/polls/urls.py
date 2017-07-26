# encoding: utf-8

from django.conf.urls import url
from . import views

urlpatterns = [
    url(r'^$', views.IndexView.as_view(), name='index'),
    url(r'^(?P<pk>[0-9]+)/$', views.DetailView.as_view(), name='detail'),
    url(R'^(?P<pk>[0-9]+)/result/$', views.ResultView.as_view(), name='result'),
    url(R'^(?P<question_id>[0-9]+)/vote/$', views.vote, name='vote'),
]
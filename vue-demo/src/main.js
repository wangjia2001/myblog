import Vue from 'vue';
import App from './App.vue';
import router from './router';
import store from './store';
import Element from  'element-ui';
import "element-ui/lib/theme-chalk/index.css";
import mavonEditor from 'mavon-editor'

var axios = require('axios')
axios.defaults.baseURL = 'http://localhost:8080/api'

Vue.prototype.$axios = axios 
// Vue.prototype.HOST = '/api'
Vue.config.productionTip = false
// axios.defaults.headers.post['Content-Type'] = 'application/json';

Vue.use(Element)
Vue.use(mavonEditor)

router.beforeEach((to, from, next) => {
  if (to.meta.requireAuth) {
    if (store.state.user.username) {
      next()
    } else {
      next({
        path: 'login',
        query: {redirect: to.fullPath}
      })
    }
  } else {
    next()
  }
}
)

new Vue({
  el: '#app',
  render: h => h(App),
  router,
  store,
  components: { App },
  template: '<App/>'
})
import Vue from 'vue'
import VueRouter from 'vue-router'
// import Home from '../views/Home.vue'
import Login from '@/components/Login'
// import AppIndex from '@/components/home/Appindex'
import Home from '@/components/home'
// import LibraryIndex from '../components/library/LibraryIndex'
import Book from '../components/Book'
import BlogDetail from '../views/BlogDetail.vue'
import BlogEdit from '../views/BlogEdit.vue'
import About from '../views/About.vue'
import Blogs from '../views/Blogs.vue'
import BlogAdd from '../views/BlogAdd.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
    // home页面并不需要被访问
    redirect: '/index',
    children: [
       {
        path: '/index',
        name: 'Index',
        redirect: { name: 'Blogs' },
        meta: {
          requireAuth: true
        }
      },

      {
        path:'/blog',
        name:'Blogs',
        meta: {
          requireAuth: true
        },
        component: Blogs
      },
        {
          path: '/blog/add', // 注意放在 path: '/blog/:blogId'之前
          name: 'BlogAdd',
          meta: {
            requireAuth: true
          },
          component: BlogAdd
        },
        {
          path: '/blog/blogId',
          name: 'BlogDetail',
          component: BlogDetail
        },
        {
          path: '/blog/blogId/edit',
          name: 'BlogEdit',
          meta: {
            requireAuth: true
          },
          component: BlogEdit
        },
    ],
  },

  {
    path: '/library',
    name: 'Library',
    component: Book,
    meta: {
      requireAuth: true
    }
  },
      {
        path: '/login',
          name: 'Login',
          component: Login
      },
      {
        path:'/about',
        name:'About',
        component:About
      }

  ]



const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router

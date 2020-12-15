<template>
  <!-- <el-menu class="el-menu-demo" mode="horizontal">
      <el-menu-item index="1"
        ><router-link to="/">Panel Admin</router-link></el-menu-item
      >
      <el-menu-item index="4"
        ><router-link to="/dishes">Dishes</router-link></el-menu-item
      >
    </el-menu>
    <el-container>
      <el-main>
        <router-view />
      </el-main>
      <el-footer> </el-footer>
    </el-container> -->
  <el-container id="app" class="app-container">
    <side-bar />
    <el-container>
      <el-header class="header-page"><header-page /></el-header>
      <el-main><router-view /></el-main>
      <el-footer class="footer-page"><footer-page /></el-footer>
    </el-container>
  </el-container>
</template>
<script>
import SideBar from "./components/layout/SideBar";
import FooterPage from "./components/layout/FooterPage";
import HeaderPage from "./components/layout/HeaderPage";
export default {
  components: {
    SideBar,
    HeaderPage,
    FooterPage,
  },
  methods: {
    goBack() {
      console.log("go back");
    },
  },
};
</script>
<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  height: 100%;
  width: 100%;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
.el-menu-item {
  a {
    text-decoration: none;
  }
}
</style>

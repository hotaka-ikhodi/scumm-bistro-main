<template>
  <div id="app">
    <el-container>
      <el-header>
        <el-menu class="el-menu-demo" mode="horizontal">
          <el-menu-item index="1"
            ><router-link to="/">Panel Admin</router-link></el-menu-item
          >
          <el-menu-item index="4"
            ><router-link to="/dishes">Dishes</router-link></el-menu-item
          >
        </el-menu>
      </el-header>
      <el-main>
        <router-view />
      </el-main>
      <el-footer> </el-footer>
    </el-container>
  </div>
</template>
<script>
export default {
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

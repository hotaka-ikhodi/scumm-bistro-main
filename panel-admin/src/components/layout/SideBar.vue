<template>
  <el-aside width="200px" class="side-bar">
    <el-menu
      default-active="2"
      class="el-menu-vertical"
      @open="handleOpen"
      @close="handleClose"
      router="true"
    >
      <el-menu-item index="1">
        <img
          alt="Hotaka"
          src="../../assets/img/Hotaka_800x237.png"
          width="100%"
        />
      </el-menu-item>
      <el-menu-item index="home">
        <i class="el-icon-menu"></i>
        <span>Home</span>
      </el-menu-item>
      <el-menu-item index="dishes">
        <i class="el-icon-menu"></i>
        <span>Dishes</span>
      </el-menu-item>
    </el-menu>
  </el-aside>
</template>
<script>
export default {};
</script>
<style lang="scss" scoped>
</style>
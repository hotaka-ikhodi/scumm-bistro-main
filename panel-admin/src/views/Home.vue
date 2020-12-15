<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/img/Hotaka_800x237.png" />
    <HelloWorld msg="Bienvenidos a la formación Hotaka" />
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from "@/components/HelloWorld.vue";

export default {
  name: "Home",
  components: {
    HelloWorld,
  },
};
</script>

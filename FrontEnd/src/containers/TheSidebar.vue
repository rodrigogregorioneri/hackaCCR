<template>
  <CSidebar 
    fixed 
    :minimize="minimize"
    :show="show"
    @update:show="(value) => $store.commit('set', ['sidebarShow', value])"
  >
    <CSidebarBrand class="d-md-down-none" to="/">
      <CIcon 
        class="c-sidebar-brand-full" 
        src="https://previews.dropbox.com/p/thumb/AA1M3dydT1WUtTSFq58oxFK11rEFJv__WV_KRZsps5XwqYIjHTjh_mEYPwik24nyCn1BlPDZB7CyyKxr3vDkWZdk1eb0TvXWWiKdCBdIrBf487VNEyqgAwfGacBcptZN0o6ffg2Y2wIJ5wQPY1AaQqz_byxaK6l-Uu2yBy218Y05ydrgaJ0euwdEsGxbF6mMNGAs9IHEoiOqSrp4sV0AFRgk8ZtUEWA3g2sqVOJme4DRn79xiHrApP8oIO9ORxmPgJ184cE2U4JSd6uO5Q5xDBCN1AXFlqGan5vZRxEs9Ks8ShsENxwKFRr0vael3D9C6Rjdb9itP5pYe_lSbLcAhXJfhqzeBjclcsRUabzcNXQUPg/p.png?fv_content=true&size_mode=5"
        size="custom-size" 
        :height="35" 
        viewBox="0 0 556 134"
      />
      <CIcon 
        class="c-sidebar-brand-minimized" 
        src="https://previews.dropbox.com/p/thumb/AA3iEeAyITevYghuyYlgUOqQNyqV9KIkfXfenUvwTM0vN3BudAMmtCU1mmaGZQ7MBbziK5E0liD1Ekbw6pwnyFytTFVeqqcVi66JcTFUaiT7Z_l77NBRQZjObOuYgmjnIx-KvmAKcB7EF95bnc4ijfbzX0etdBBnmrJTk7ZpYiX5QKy_kKJ7Y2w66Jrh3OIitsgg3zwyrDWlBwZVWPYml73xIUAbZkbhpawEfAVAD8usAyRuPUJUsrdbXDy15BQJa8zGBqj7UOISbOFtivzmBj6OFeLx5z1c7JkwK4O1LoGLlWJ0lQ9eSdLdXb1Dn2K1cYm-Z4V-cJ-qhld1V7oTqr_hnyn9EtRor34dm4zU_gjSEg/p.png?fv_content=true&size_mode=5"
        size="custom-size" 
        :height="35" 
        viewBox="0 0 110 134"
      />
    </CSidebarBrand>

    <CRenderFunction flat :content-to-render="$options.nav"/>
    <CSidebarMinimizer
      class="d-md-down-none"
      @click.native="$store.commit('set', ['sidebarMinimize', !minimize])"
    />
  </CSidebar>
</template>

<script>
import nav from './_nav'

export default {
  name: 'TheSidebar',
  nav,
  computed: {
    show () {
      return this.$store.state.sidebarShow 
    },
    minimize () {
      return this.$store.state.sidebarMinimize 
    }
  }
}
</script>

export default [
  {
    _name: 'CSidebarNav',
    _children: [
      {
        _name: 'CSidebarNavItem',
        name: 'Analytics Tubarão',
        to: '/dashboard',
        icon: 'cil-speedometer',
        badge: {
          color: 'primary',
          // text: 'NEW'
        }
      },
      {
        _name: 'CSidebarNavTitle',
        _children: ['Theme']
      },
      {
        _name: 'CSidebarNavItem',
        name: 'Previsão do tempo',
        to: '/theme/colors',
        icon: 'cil-drop'
      },
      {
        _name: 'CSidebarNavItem',
        name: 'Configurações',
        to: '/theme/typography',
        icon: 'cil-settings'
      },
      {
        _name: 'CSidebarNavTitle',
        _children: ['Components']
      },
      // {
      //   _name: 'CSidebarNavDropdown',
      //   name: 'Base',
      //   route: '/base',
      //   icon: 'cil-puzzle',
      //   items: [
      //     {
      //       name: 'Breadcrumbs',
      //       to: '/base/breadcrumbs'
      //     },
      //     {
      //       name: 'Cards',
      //       to: '/base/cards'
      //     },
      //     {
      //       name: 'Carousels',
      //       to: '/base/carousels'
      //     }, 
      //     {
      //       name: 'Collapses',
      //       to: '/base/collapses'
      //     },
      //     {
      //       name: 'Forms',
      //       to: '/base/forms'
      //     },
      //     {
      //       name: 'Jumbotrons',
      //       to: '/base/jumbotrons'
      //     },
      //     {
      //       name: 'List Groups',
      //       to: '/base/list-groups'
      //     },
      //     {
      //       name: 'Navs',
      //       to: '/base/navs'
      //     },
      //     {
      //       name: 'Navbars',
      //       to: '/base/navbars'
      //     },
      //     {
      //       name: 'Paginations',
      //       to: '/base/paginations'
      //     },
      //     {
      //       name: 'Popovers',
      //       to: '/base/popovers'
      //     },
      //     {
      //       name: 'Progress Bars',
      //       to: '/base/progress-bars'
      //     },
      //     {
      //       name: 'Switches',
      //       to: '/base/switches'
      //     },
      //     {
      //       name: 'Tables',
      //       to: '/base/tables'
      //     },
      //     {
      //       name: 'Tabs',
      //       to: '/base/tabs'
      //     },
      //     {
      //       name: 'Tooltips',
      //       to: '/base/tooltips'
      //     }
      //   ]
      // },
      // {
      //   _name: 'CSidebarNavDropdown',
      //   name: 'Mapa da rodovia',
      //   to: '/buttons',
      //   icon: 'cil-cursor',

        
      //   // items: [
      //   //   {
      //   //     name: 'Buttons',
      //   //     to: '/buttons/standard-buttons'
      //   //   },
      //   //   {
      //   //     name: 'Button Dropdowns',
      //   //     to: '/buttons/dropdowns'
      //   //   },
      //   //   {
      //   //     name: 'Button Groups',
      //   //     to: '/buttons/button-groups'
      //   //   },
      //   //   {
      //   //     name: 'Brand Buttons',
      //   //     to: '/buttons/brand-buttons'
      //   //   }
      //   // ]
      // },

      // ,
      {
        _name: 'CSidebarNavItem',
        name: 'Mapa das rodovias',
        to: '/buttons',
        icon: 'cil-cursor'
      },
      {
        _name: 'CSidebarNavItem',
        name: 'Business Intelligence Tubarão',
        to: '/charts',
        icon: 'cil-chart-pie'
      },
      // {
      //   _name: 'CSidebarNavDropdown',
      //   name: 'Icons',
      //   route: '/icons',
      //   icon: 'cil-star',
      //   items: [
      //     {
      //       name: 'CoreUI Icons',
      //       to: '/icons/coreui-icons',
      //       badge: {
      //         color: 'info',
      //         text: 'NEW'
      //       }
      //     },
      //     {
      //       name: 'Brands',
      //       to: '/icons/brands'
      //     },
      //     {
      //       name: 'Flags',
      //       to: '/icons/flags'
      //     }
      //   ]
      // },
      {
        _name: 'CSidebarNavItem',
        name: 'Alertas',
        to: '/widgets',
        icon: 'cil-bell',

      },
      // {
      //   _name: 'CSidebarNavItem',
      //   name: 'Widgets',
      //   to: '/widgets',
      //   icon: 'cil-calculator',
      //   badge: {
      //     color: 'primary',
      //     text: 'NEW',
      //     shape: 'pill'
      //   }
      // },
      // {
      //   _name: 'CSidebarNavDivider',
      //   _class: 'm-2'
      // },
      // {
      //   _name: 'CSidebarNavTitle',
      //   _children: ['Extras']
      // },
      {
        _name: 'CSidebarNavItem',
        name: 'Rankig dos Caminhoneiros',
        to: '/icons',
        icon: 'cil-star',

      },
      // {
      //   _name: 'CSidebarNavItem',
      //   name: 'Download CoreUI',
      //   href: 'http://coreui.io/vue/',
      //   icon: { name: 'cil-cloud-download', class: 'text-white' },
      //   _class: 'bg-success text-white',
      //   target: '_blank'
      // },
      // {
      //   _name: 'CSidebarNavItem',
      //   name: 'Try CoreUI PRO',
      //   href: 'http://coreui.io/pro/vue/',
      //   icon: { name: 'cil-layers', class: 'text-white' },
      //   _class: 'bg-danger text-white',
      //   target: '_blank'
      // }
    ]
  }
]
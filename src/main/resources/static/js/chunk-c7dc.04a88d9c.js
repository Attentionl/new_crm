(window.webpackJsonp=window.webpackJsonp||[]).push([["chunk-c7dc"],{"/3DH":function(e,t,a){"use strict";var l=a("b++a");a.n(l).a},131:function(e,t){},206:function(e,t){},207:function(e,t){},Cf4V:function(e,t,a){},ZkUv:function(e,t,a){"use strict";var l=a("Cf4V");a.n(l).a},"b++a":function(e,t,a){},fWp3:function(e,t,a){"use strict";a.r(t);var l=a("KTTK"),r=a("conU"),i=a("a/LZ"),n=a.n(i),s=a("7MAe"),o=a.n(s),c=a("zmnf"),u=a.n(c),d={name:"TaskSetStatistics",components:{},data:function(){return{pickerOptions:{disabledDate:function(e){return e.getTime()>Date.now()}},loading:!1,tableHeight:document.documentElement.clientHeight-290,tabType:"department",dateSelect:"",typeSelect:1,structuresProps:{children:"children",label:"label",value:"id"},deptList:[],structuresSelectValue:[],userOptions:[],userSelectValue:"",isEdit:!1,list:[],fieldList:[{field:"name",name:""},{field:"yeartarget",name:"全年"},{field:"first",name:"第一季度"},{field:"january",name:"1月"},{field:"february",name:"2月"},{field:"march",name:"3月"},{field:"second",name:"第二季度"},{field:"april",name:"4月"},{field:"may",name:"5月"},{field:"june",name:"6月"},{field:"third",name:"第三季度"},{field:"july",name:"7月"},{field:"august",name:"8月"},{field:"september",name:"9月"},{field:"fourth",name:"第四季度"},{field:"october",name:"10月"},{field:"november",name:"11月"},{field:"december",name:"12月"}]}},computed:{},mounted:function(){var e=this;window.onresize=function(){e.tableHeight=document.documentElement.clientHeight-290},this.dateSelect=n()(new Date).year().toString(),this.getDeptList()},methods:{tabTypeClick:function(){"department"===this.tabType?this.getAhievementList():"user"===this.tabType&&(this.getUserList(),this.getAhievementListForUser())},getAhievementList:function(){var e=this;this.loading=!0;var t=this.structuresSelectValue[this.structuresSelectValue.length-1];Object(r.f)({year:this.dateSelect,type:2,status:this.typeSelect,deptId:t}).then(function(t){e.list=t.data.map(function(t){return e.getShowItem(t)}),e.list.length>=2&&e.getSubTotalModel(),e.loading=!1}).catch(function(){e.loading=!1})},getShowItem:function(e){return e.first=this.calculateFirst(e),e.second=this.calculateSecond(e),e.third=this.calculateThird(e),e.fourth=this.calculateFourth(e),e.yeartarget=this.calculateAll(e),e},getSubTotalModel:function(){for(var e={name:"直属下级目标总和",january:"0.00",february:"0.00",march:"0.00",april:"0.00",may:"0.00",june:"0.00",july:"0.00",august:"0.00",september:"0.00",october:"0.00",november:"0.00",december:"0.00",yeartarget:"0.00",first:"0.00",second:"0.00",third:"0.00",fourth:"0.00",ignore:!0},t=1;t<this.list.length;t++)for(var a=this.list[t],l=0;l<this.fieldList.length;l++){var r=this.fieldList[l];"name"!==r.field&&(e[r.field]=(parseFloat(e[r.field])+parseFloat(a[r.field])).toFixed(2).toString())}this.list.splice(1,0,e)},handleInputEdit:function(e,t){if("change"===e){var a=t.row[t.column.property]?t.row[t.column.property]:"0.00",l=a.replace(/^(\-)*(\d+)\.(\d\d).*$/,"$1$2.$3");a!==l&&(t.row[t.column.property]=l,this.$set(this.list,t.$index,t.row))}else"blur"===e&&("january"===t.column.property||"february"===t.column.property||"march"===t.column.property?(t.row.first=this.calculateFirst(t.row),t.row.yeartarget=this.calculateAll(t.row)):"april"===t.column.property||"may"===t.column.property||"june"===t.column.property?(t.row.second=this.calculateSecond(t.row),t.row.yeartarget=this.calculateAll(t.row)):"july"===t.column.property||"august"===t.column.property||"september"===t.column.property?(t.row.third=this.calculateThird(t.row),t.row.yeartarget=this.calculateAll(t.row)):"october"!==t.column.property&&"november"!==t.column.property&&"december"!==t.column.property||(t.row.fourth=this.calculateFourth(t.row),t.row.yeartarget=this.calculateAll(t.row)),"department"===this.tabType&&this.list.length>=2&&this.calculateSubTotal(t))},calculateSubTotal:function(e){for(var t=this.list[1],a="0",l=2;l<this.list.length;l++){var r=this.list[l];a=(parseFloat(a)+parseFloat(r[e.column.property])).toFixed(2).toString()}t[e.column.property]=a,"january"===e.column.property||"february"===e.column.property||"march"===e.column.property?(t.first=this.calculateFirst(t),t.yeartarget=this.calculateAll(t)):"april"===e.column.property||"may"===e.column.property||"june"===e.column.property?(t.second=this.calculateSecond(t),t.yeartarget=this.calculateAll(t)):"july"===e.column.property||"august"===e.column.property||"september"===e.column.property?(t.third=this.calculateThird(t),t.yeartarget=this.calculateAll(t)):"october"!==e.column.property&&"november"!==e.column.property&&"december"!==e.column.property||(t.fourth=this.calculateFourth(t),t.yeartarget=this.calculateAll(t))},calculateFirst:function(e){return(parseFloat(e.january)+parseFloat(e.february)+parseFloat(e.march)).toFixed(2).toString()},calculateSecond:function(e){return(parseFloat(e.april)+parseFloat(e.may)+parseFloat(e.june)).toFixed(2).toString()},calculateThird:function(e){return(parseFloat(e.july)+parseFloat(e.august)+parseFloat(e.september)).toFixed(2).toString()},calculateFourth:function(e){return(parseFloat(e.october)+parseFloat(e.november)+parseFloat(e.december)).toFixed(2).toString()},calculateAll:function(e){return(parseFloat(e.first)+parseFloat(e.second)+parseFloat(e.third)+parseFloat(e.fourth)).toFixed(2).toString()},getDeptList:function(){var e=this;Object(l.h)({type:"tree"}).then(function(t){e.deptList=t.data,t.data.length>0&&(e.structuresSelectValue=[t.data[0].id],e.tabTypeClick())})},structuresValueChange:function(e){"department"===this.tabType?this.userSelectValue&&(this.userSelectValue="",this.userOptions=[]):"user"===this.tabType&&(this.userSelectValue="",this.userOptions=[],this.getUserList())},getUserList:function(){var e=this,t={pageType:0};this.structuresSelectValue.length>0?(t.deptId=this.structuresSelectValue[this.structuresSelectValue.length-1],Object(l.j)(t).then(function(t){e.userOptions=t.data}).catch(function(){})):(this.userSelectValue="",this.userOptions=[])},getAhievementListForUser:function(){var e=this;this.loading=!0;var t=this.structuresSelectValue[this.structuresSelectValue.length-1];Object(r.f)({year:this.dateSelect,type:3,status:this.typeSelect,deptId:t,userId:this.userSelectValue}).then(function(t){e.list=t.data.map(function(t){return e.getShowItem(t)}),e.loading=!1}).catch(function(){e.loading=!1})},handleClick:function(e){var t=this;if("search"==e)this.updateAhievementList();else if("edit"==e)this.isEdit=!0;else if("export"==e){var a=document.querySelector(".el-table__fixed"),l=void 0;a?(l=u.a.utils.table_to_book(document.getElementById("task-set-table").removeChild(a)),document.getElementById("task-set-table").appendChild(a)):l=u.a.utils.table_to_book(document.getElementById("task-set-table"));var i=u.a.write(l,{bookType:"xlsx",bookSST:!1,type:"binary"}),n=this.dateSelect+" 年"+{department:"部门目标",user:"员工目标"}[this.tabType]+".xlsx";o.a.saveAs(new Blob([this.s2ab(i)],{type:"application/octet-stream;charset=utf-8"}),n)}else if("save"==e){this.loading=!0;var s=this.list;"department"===this.tabType?s=this.list.filter(function(e,t,a){return!e.ignore}):"user"===this.tabType&&(s=this.list),Object(r.g)(s).then(function(e){t.$message.success("操作成功"),t.loading=!1,t.isEdit=!1,t.updateAhievementList()}).catch(function(){t.loading=!1})}else"cancel"==e&&(this.updateAhievementList(),this.isEdit=!1)},s2ab:function(e){var t,a;if("undefined"!=typeof ArrayBuffer){t=new ArrayBuffer(e.length);var l=new Uint8Array(t);for(a=0;a!==e.length;a++)l[a]=255&e.charCodeAt(a);return t}for(t=new Array(e.length),a=0;a!==e.length;++a)t[a]=255&e.charCodeAt(a);return t},updateAhievementList:function(){"department"===this.tabType?this.getAhievementList():"user"===this.tabType&&this.getAhievementListForUser()},cellStyle:function(e){e.row,e.column;var t=e.rowIndex,a=e.columnIndex;return 1===t&&"department"===this.tabType?{backgroundColor:"#E5F4FE"}:1==a||2==a||6==a||10==a||14==a?{backgroundColor:"#E5F4FE",textAlign:"center"}:{textAlign:"center"}}}},p=(a("ZkUv"),a("ZrdR")),h=Object(p.a)(d,function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"main-container"},[a("div",{staticClass:"tabs-bar"},[a("el-tabs",{on:{"tab-click":e.tabTypeClick},model:{value:e.tabType,callback:function(t){e.tabType=t},expression:"tabType"}},[a("el-tab-pane",{attrs:{label:"部门目标设置",name:"department"}}),e._v(" "),a("el-tab-pane",{attrs:{label:"员工目标设置",name:"user"}})],1)],1),e._v(" "),a("div",{staticClass:"handle-bar"},[a("el-date-picker",{attrs:{clearable:!1,"picker-options":e.pickerOptions,type:"year","value-format":"yyyy",placeholder:"选择年"},model:{value:e.dateSelect,callback:function(t){e.dateSelect=t},expression:"dateSelect"}}),e._v(" "),a("el-select",{attrs:{placeholder:"请选择"},model:{value:e.typeSelect,callback:function(t){e.typeSelect=t},expression:"typeSelect"}},e._l([{label:"合同金额",value:1},{label:"回款金额",value:2}],function(e){return a("el-option",{key:e.value,attrs:{label:e.label,value:e.value}})})),e._v(" "),a("el-cascader",{attrs:{options:e.deptList,"show-all-levels":!1,props:e.structuresProps,placeholder:"选择部门","change-on-select":""},on:{change:e.structuresValueChange},model:{value:e.structuresSelectValue,callback:function(t){e.structuresSelectValue=t},expression:"structuresSelectValue"}}),e._v(" "),"user"===e.tabType?a("el-select",{attrs:{clearable:!0,placeholder:"选择员工"},model:{value:e.userSelectValue,callback:function(t){e.userSelectValue=t},expression:"userSelectValue"}},e._l(e.userOptions,function(e){return a("el-option",{key:e.userId,attrs:{label:e.realname,value:e.userId}})})):e._e(),e._v(" "),a("el-button",{attrs:{type:"primary"},nativeOn:{click:function(t){e.handleClick("search")}}},[e._v("搜索")]),e._v(" "),e.isEdit?e._e():a("div",{staticStyle:{float:"right"}},[a("el-button",{attrs:{type:"primary"},nativeOn:{click:function(t){e.handleClick("edit")}}},[e._v("编辑")]),e._v(" "),a("el-button",{attrs:{type:"primary"},nativeOn:{click:function(t){e.handleClick("export")}}},[e._v("导出")])],1),e._v(" "),e.isEdit?a("div",{staticStyle:{float:"right"}},[a("el-button",{attrs:{type:"primary"},nativeOn:{click:function(t){e.handleClick("save")}}},[e._v("保存")]),e._v(" "),a("el-button",{attrs:{type:"primary"},nativeOn:{click:function(t){e.handleClick("cancel")}}},[e._v("取消")])],1):e._e()],1),e._v(" "),a("div",{staticClass:"content"},[a("el-table",{attrs:{id:"task-set-table",data:e.list,height:e.tableHeight,"cell-style":e.cellStyle,border:"","header-align":"center",align:"center","highlight-current-row":""}},e._l(e.fieldList,function(t,l){return a("el-table-column",{key:l,attrs:{fixed:0==l,prop:t.field,label:t.name,"show-overflow-tooltip":"",width:"150"},scopedSlots:e._u([{key:"default",fn:function(l){return["name"===t.field||"yeartarget"===t.field||"first"===t.field||"second"===t.field||"third"===t.field||"fourth"===t.field||!e.isEdit||"department"===e.tabType&&1===l.$index?a("div",{staticClass:"table-show-item"},[e._v("\n            "+e._s(l.row[t.field])+"\n          ")]):a("el-input",{attrs:{type:"number"},on:{input:function(t){e.handleInputEdit("change",l)},blur:function(t){e.handleInputEdit("blur",l)}},model:{value:l.row[t.field],callback:function(a){e.$set(l.row,t.field,a)},expression:"scope.row[item.field]"}})]}}])})}))],1)])},[],!1,null,"4035b7dd",null);h.options.__file="TaskSetStatistics.vue";var f={name:"BizGoals",components:{TaskSetStatistics:h.exports},data:function(){return{}},created:function(){},methods:{}},m=(a("/3DH"),Object(p.a)(f,function(){var e=this.$createElement,t=this._self._c||e;return t("div",{staticClass:"system-customer"},[t("div",{staticClass:"title"},[this._v("业绩目标设置")]),this._v(" "),t("div",{staticClass:"customer-content"},[t("div",{staticClass:"system-view-table"},[t("task-set-statistics")],1)])])},[],!1,null,"1d3d38df",null));m.options.__file="index.vue";t.default=m.exports}}]);
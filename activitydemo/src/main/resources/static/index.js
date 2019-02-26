alert('我是index.js,我被成功调用了');
alert('哈哈');
$(function () {
    alert("测试")
    // window.location.href="test.html?act=logout"
    //window.navigate("test.html");
    // var vm=new Vue({
    //     el:'#abc',
    //     data: {
    //         submitUrl: "/getall", //跳转的路径
    //         user: "",
    //         users: [],  //表单数据集合
    //         titleName: "",
    //         TyuserId: "" , //表单数据的id
    //         nowIndex:-1,
    //         uname:"",
    //         upwd:"",
    //         uid:""
    //     }
    //     ,
    //     methods:{
    //         getAll : function(){
    //             //上面方法从新赋值
    //             var currenr_this=this;
    //             //跳转的路径
    //             currenr_this.submitUrl='/getall';
    //             //通过json方式得到数据
    //             $.getJSON(currenr_this.submitUrl,function(result,status){
    //                 //把结果集赋给定义的users，用来页面展示
    //                 currenr_this._data.users=result;
    //                 // alert(result);  //得到对象集合
    //             })
    //         },
    //
    //         remove :function (index) {
    //             var item=this.users[index];
    //             // alert(item.uname);
    //             if (confirm('确定要删除:'+item.uname+'这个用户吗？')) {
    //                 var current_this=this;
    //                 $.ajax({
    //                     url:'/delete.action',
    //                     data:{uid:item.uid},
    //                     dataType:'JSON',
    //                     success:function(result){
    //                         alert('删除数据失败！');
    //                     },
    //                     error:function(result){
    //                         alert('数据已经成功删除！');
    //                         current_this.users.splice(index, 1)
    //                     }
    //
    //                 })
    //             }
    //
    //         },
    //
    //         add : function () {
    //             //   $('#addform').modal('show');
    //
    //         },
    //         update :function (index) {
    //             var current_this=this;
    //             var item=this.users[index];
    //             current_this.uname=item.uname;
    //             current_this.upwd=item.upwd;
    //             current_this. uid=item.uid;
    //         }
    //
    //
    //     },
    //
    //     created : function(){
    //         this.getAll();
    //     },
    //
    //
    // });
    alert("测试b")
});


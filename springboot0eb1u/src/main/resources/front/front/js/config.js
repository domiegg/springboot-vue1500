
var projectName = '基于SpringBoot的CSGO赛事管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '赛事信息',
	url: './pages/saishixinxi/list.html'
}, 

{
	name: '赛事通知',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springboot0eb1u/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"参赛战队","menuJump":"列表","tableName":"cansaizhandui"}],"menu":"参赛战队管理"},{"child":[{"appFrontIcon":"cuIcon-send","buttons":["新增","查看","修改","删除","审核"],"menu":"合作方","menuJump":"列表","tableName":"hezuofang"}],"menu":"合作方管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","修改","删除","新增"],"menu":"赛事信息","menuJump":"列表","tableName":"saishixinxi"}],"menu":"赛事信息管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除","审核"],"menu":"申请合作","menuJump":"列表","tableName":"shenqinghezuo"}],"menu":"申请合作管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","删除","审核"],"menu":"赛事报名","menuJump":"列表","tableName":"saishibaoming"}],"menu":"赛事报名管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"赛事通知","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"赛事信息列表","menuJump":"列表","tableName":"saishixinxi"}],"menu":"赛事信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","赛事申请","赛事报名"],"menu":"赛事信息","menuJump":"列表","tableName":"saishixinxi"}],"menu":"赛事信息管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看"],"menu":"赛事报名","menuJump":"列表","tableName":"saishibaoming"}],"menu":"赛事报名管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"赛事信息列表","menuJump":"列表","tableName":"saishixinxi"}],"menu":"赛事信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"参赛战队","tableName":"cansaizhandui"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","申请合作"],"menu":"赛事信息","menuJump":"列表","tableName":"saishixinxi"}],"menu":"赛事信息管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看"],"menu":"申请合作","menuJump":"列表","tableName":"shenqinghezuo"}],"menu":"申请合作管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"赛事信息列表","menuJump":"列表","tableName":"saishixinxi"}],"menu":"赛事信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"合作方","tableName":"hezuofang"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

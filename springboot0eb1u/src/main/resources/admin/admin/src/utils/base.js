const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0eb1u/",
            name: "springboot0eb1u",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0eb1u/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SpringBoot的CSGO赛事管理系统"
        } 
    }
}
export default base

import{b$ as V,c0 as F,a as S,r as N,bC as U,ac as Y,d as T,ad as Z,bU as z,a$ as $,a6 as E,bk as H,Z as J,aZ as B,i as W,aa as K,ab as A,aY as ee,ai as j,bK as te,bN as se,a5 as ne,c1 as O}from"./index-DVxvz-Q9.js";import{g as re}from"./Space-CiOp0hQH.js";function ie(e){if(typeof e=="number")return{"":e.toString()};const t={};return e.split(/ +/).forEach(r=>{if(r==="")return;const[n,s]=r.split(":");s===void 0?t[""]=n:t[n]=s}),t}function w(e,t){var r;if(e==null)return;const n=ie(e);if(t===void 0)return n[""];if(typeof t=="string")return(r=n[t])!==null&&r!==void 0?r:n[""];if(Array.isArray(t)){for(let s=t.length-1;s>=0;--s){const i=t[s];if(i in n)return n[i]}return n[""]}else{let s,i=-1;return Object.keys(n).forEach(a=>{const l=Number(a);!Number.isNaN(l)&&t>=l&&l>=i&&(i=l,s=n[a])}),s}}function oe(e){var t;const r=(t=e.dirs)===null||t===void 0?void 0:t.find(({dir:n})=>n===V);return!!(r&&r.value===!1)}const ae={xs:0,s:640,m:1024,l:1280,xl:1536,"2xl":1920};function le(e){return`(min-width: ${e}px)`}const G={};function fe(e=ae){if(!F)return S(()=>[]);if(typeof window.matchMedia!="function")return S(()=>[]);const t=N({}),r=Object.keys(e),n=(s,i)=>{s.matches?t.value[i]=!0:t.value[i]=!1};return r.forEach(s=>{const i=e[s];let a,l;G[i]===void 0?(a=window.matchMedia(le(i)),a.addEventListener?a.addEventListener("change",d=>{l.forEach(f=>{f(d,s)})}):a.addListener&&a.addListener(d=>{l.forEach(f=>{f(d,s)})}),l=new Set,G[i]={mql:a,cbs:l}):(a=G[i].mql,l=G[i].cbs),l.add(n),a.matches&&l.forEach(d=>{d(a,s)})}),U(()=>{r.forEach(s=>{const{cbs:i}=G[e[s]];i.has(n)&&i.delete(n)})}),S(()=>{const{value:s}=t;return r.filter(i=>s[i])})}const P=1,L=Y("n-grid"),Q=1,X={span:{type:[Number,String],default:Q},offset:{type:[Number,String],default:0},suffix:Boolean,privateOffset:Number,privateSpan:Number,privateColStart:Number,privateShow:{type:Boolean,default:!0}},ve=H(X),me=T({__GRID_ITEM__:!0,name:"GridItem",alias:["Gi"],props:X,setup(){const{isSsrRef:e,xGapRef:t,itemStyleRef:r,overflowRef:n,layoutShiftDisabledRef:s}=Z(L),i=z();return{overflow:n,itemStyle:r,layoutShiftDisabled:s,mergedXGap:S(()=>$(t.value||0)),deriveStyle:()=>{e.value;const{privateSpan:a=Q,privateShow:l=!0,privateColStart:d=void 0,privateOffset:f=0}=i.vnode.props,{value:x}=t,g=$(x||0);return{display:l?"":"none",gridColumn:`${d??`span ${a}`} / span ${a}`,marginLeft:f?`calc((100% - (${a} - 1) * ${g}) / ${a} * ${f} + ${g} * ${f})`:""}}}},render(){var e,t;if(this.layoutShiftDisabled){const{span:r,offset:n,mergedXGap:s}=this;return E("div",{style:{gridColumn:`span ${r} / span ${r}`,marginLeft:n?`calc((100% - (${r} - 1) * ${s}) / ${r} * ${n} + ${s} * ${n})`:""}},this.$slots)}return E("div",{style:[this.itemStyle,this.deriveStyle()]},(t=(e=this.$slots).default)===null||t===void 0?void 0:t.call(e,{overflow:this.overflow}))}}),ue={xs:0,s:640,m:1024,l:1280,xl:1536,xxl:1920},q=24,k="__ssr__",de={layoutShiftDisabled:Boolean,responsive:{type:[String,Boolean],default:"self"},cols:{type:[Number,String],default:q},itemResponsive:Boolean,collapsed:Boolean,collapsedRows:{type:Number,default:1},itemStyle:[Object,String],xGap:{type:[Number,String],default:0},yGap:{type:[Number,String],default:0}},he=T({name:"Grid",inheritAttrs:!1,props:de,setup(e){const{mergedClsPrefixRef:t,mergedBreakpointsRef:r}=J(e),n=/^\d+$/,s=N(void 0),i=fe((r==null?void 0:r.value)||ue),a=B(()=>!!(e.itemResponsive||!n.test(e.cols.toString())||!n.test(e.xGap.toString())||!n.test(e.yGap.toString()))),l=S(()=>{if(a.value)return e.responsive==="self"?s.value:i.value}),d=B(()=>{var u;return(u=Number(w(e.cols.toString(),l.value)))!==null&&u!==void 0?u:q}),f=B(()=>w(e.xGap.toString(),l.value)),x=B(()=>w(e.yGap.toString(),l.value)),g=u=>{s.value=u.contentRect.width},v=u=>{se(g,u)},b=N(!1),y=S(()=>{if(e.responsive==="self")return v}),p=N(!1),m=N();return W(()=>{const{value:u}=m;u&&u.hasAttribute(k)&&(u.removeAttribute(k),p.value=!0)}),K(L,{layoutShiftDisabledRef:A(e,"layoutShiftDisabled"),isSsrRef:p,itemStyleRef:A(e,"itemStyle"),xGapRef:f,overflowRef:b}),{isSsr:!ee,contentEl:m,mergedClsPrefix:t,style:S(()=>e.layoutShiftDisabled?{width:"100%",display:"grid",gridTemplateColumns:`repeat(${e.cols}, minmax(0, 1fr))`,columnGap:$(e.xGap),rowGap:$(e.yGap)}:{width:"100%",display:"grid",gridTemplateColumns:`repeat(${d.value}, minmax(0, 1fr))`,columnGap:$(f.value),rowGap:$(x.value)}),isResponsive:a,responsiveQuery:l,responsiveCols:d,handleResize:y,overflow:b}},render(){if(this.layoutShiftDisabled)return E("div",j({ref:"contentEl",class:`${this.mergedClsPrefix}-grid`,style:this.style},this.$attrs),this.$slots);const e=()=>{var t,r,n,s,i,a,l;this.overflow=!1;const d=ne(re(this)),f=[],{collapsed:x,collapsedRows:g,responsiveCols:v,responsiveQuery:b}=this;d.forEach(o=>{var C,h,c,R,D;if(((C=o==null?void 0:o.type)===null||C===void 0?void 0:C.__GRID_ITEM__)!==!0)return;if(oe(o)){const _=O(o);_.props?_.props.privateShow=!1:_.props={privateShow:!1},f.push({child:_,rawChildSpan:0});return}o.dirs=((h=o.dirs)===null||h===void 0?void 0:h.filter(({dir:_})=>_!==V))||null,((c=o.dirs)===null||c===void 0?void 0:c.length)===0&&(o.dirs=null);const I=O(o),M=Number((D=w((R=I.props)===null||R===void 0?void 0:R.span,b))!==null&&D!==void 0?D:P);M!==0&&f.push({child:I,rawChildSpan:M})});let y=0;const p=(t=f[f.length-1])===null||t===void 0?void 0:t.child;if(p!=null&&p.props){const o=(r=p.props)===null||r===void 0?void 0:r.suffix;o!==void 0&&o!==!1&&(y=Number((s=w((n=p.props)===null||n===void 0?void 0:n.span,b))!==null&&s!==void 0?s:P),p.props.privateSpan=y,p.props.privateColStart=v+1-y,p.props.privateShow=(i=p.props.privateShow)!==null&&i!==void 0?i:!0)}let m=0,u=!1;for(const{child:o,rawChildSpan:C}of f){if(u&&(this.overflow=!0),!u){const h=Number((l=w((a=o.props)===null||a===void 0?void 0:a.offset,b))!==null&&l!==void 0?l:0),c=Math.min(C+h,v);if(o.props?(o.props.privateSpan=c,o.props.privateOffset=h):o.props={privateSpan:c,privateOffset:h},x){const R=m%v;c+R>v&&(m+=v-R),c+m+y>g*v?u=!0:m+=c}}u&&(o.props?o.props.privateShow!==!0&&(o.props.privateShow=!1):o.props={privateShow:!1})}return E("div",j({ref:"contentEl",class:`${this.mergedClsPrefix}-grid`,style:this.style,[k]:this.isSsr||void 0},this.$attrs),f.map(({child:o})=>o))};return this.isResponsive&&this.responsive==="self"?E(te,{onResize:this.handleResize},{default:e}):e()}});export{me as _,he as a,ve as b,X as g};

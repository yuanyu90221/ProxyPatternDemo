# ProxyPattern Demo

This is repository for ProxyPattern Example on Java Project

## 1 Proxy Pattern

一種結構型設計模式

主要透過建立代理物件

透過代理物件來執行原本物件的操作


## Why?

為何不操作原本物件而需要使用代理物件呢？

基於以下幾種原因 可以把代理模式做分類

1. 保護代理:  控制對原始物件的存取, 如果有需要可以給不同使用者不同的權限 以控制對原始物件的存取

2. 虛代理: 避免原始物件被過度建立, 根據需要來建立消耗很大的物件, 該物件只有在需要石材會被真的建立

3. 遠端代理：用來在不同的位址空間上代表同一個物件, 在Java中的RMI

4. Copy-on-write 代理: 在用戶操作,只有物件確實被改變了，才會真的copy一個目標物件,算是虛代理的其中一種

5. Cache代理: 為昂貴的操作結果提供臨時的儲存空間,以便可以多個用戶端可以共用這些結果

6. 防火牆代理: 保護物件不被惡意使用者存取

7. 同步代理: 使多個使用者能夠同時存取目標物件而沒有衝突

8. 智能指引: 在存取物件時執行一些附加操作, 有效增強原有功能

## 範例
OrderProxy 是保護代理
用來控制使用者對Order的存取權限
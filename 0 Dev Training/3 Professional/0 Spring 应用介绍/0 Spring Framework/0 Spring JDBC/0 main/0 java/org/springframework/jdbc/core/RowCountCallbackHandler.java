




<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>spring-framework/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java at master · spring-projects/spring-framework · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="spring-projects/spring-framework" name="twitter:title" /><meta content="spring-framework - The Spring Framework" name="twitter:description" /><meta content="https://2.gravatar.com/avatar/6f8a529bd100f4272a9ff1b8cdfbd26e?d=https%3A%2F%2Fidenticons.github.com%2Ff69a6111b59799984ef69ab92e633d83.png&amp;r=x&amp;s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://2.gravatar.com/avatar/6f8a529bd100f4272a9ff1b8cdfbd26e?d=https%3A%2F%2Fidenticons.github.com%2Ff69a6111b59799984ef69ab92e633d83.png&amp;r=x&amp;s=400" property="og:image" /><meta content="spring-projects/spring-framework" property="og:title" /><meta content="https://github.com/spring-projects/spring-framework" property="og:url" /><meta content="spring-framework - The Spring Framework" property="og:description" />

    <meta name="hostname" content="github-fe130-cp1-prd.iad.github.net">
    <meta name="ruby" content="ruby 2.1.0p0-github-tcmalloc (87c9373a41) [x86_64-linux]">
    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="6A786901:3BDF:26DA9BA:53182D19" name="octolytics-dimension-request_id" />
    

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="rtcw2YROF7Dn27ZT6eFB7+YTxHeb/yojn8THXAv4ni8=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-ce7ab9b7dbd81fa8f2eeff348bc97553a3eaf80c.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-729e3ebdf8b0ec6ed54532c398dc8bd48d25ea1f.css" media="all" rel="stylesheet" type="text/css" />
    
    


      <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-490867a148cf94468c141093ccd4e56ed2144eb9.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-a0f1f6f8ff5a4a3b8f453ec1095a25636480fbb8.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="7b67821226317b7dab62603ad6dd2719">

        <link data-pjax-transient rel='permalink' href='/spring-projects/spring-framework/blob/49d7bda72248b5a08fda3d42ed10d9e127396e6a/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java'>

  <meta name="description" content="spring-framework - The Spring Framework" />

  <meta content="317776" name="octolytics-dimension-user_id" /><meta content="spring-projects" name="octolytics-dimension-user_login" /><meta content="1148753" name="octolytics-dimension-repository_id" /><meta content="spring-projects/spring-framework" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="1148753" name="octolytics-dimension-repository_network_root_id" /><meta content="spring-projects/spring-framework" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/spring-projects/spring-framework/commits/master.atom" rel="alternate" title="Recent Commits to spring-framework:master" type="application/atom+xml" />

  </head>


  <body class="logged_out  env-production windows vis-public page-blob tipsy-tooltips">
    <div class="wrapper">
      
      
      
      


      
      <div class="header header-logged-out">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/">
      <span class="mega-octicon octicon-logo-github"></span>
    </a>

    <div class="header-actions">
        <a class="button primary" href="/join">Sign up</a>
      <a class="button signin" href="/login?return_to=%2Fspring-projects%2Fspring-framework%2Fblob%2Fmaster%2Fspring-jdbc%2Fsrc%2Fmain%2Fjava%2Forg%2Fspringframework%2Fjdbc%2Fcore%2FRowCountCallbackHandler.java">Sign in</a>
    </div>

    <div class="command-bar js-command-bar  in-repository">

      <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
        <li class="features"><a href="/features">Features</a></li>
          <li class="enterprise"><a href="https://enterprise.github.com/">Enterprise</a></li>
          <li class="blog"><a href="/blog">Blog</a></li>
      </ul>
        <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    
      data-repo="spring-projects/spring-framework"
      data-branch="master"
      data-sha="78a8bfca364973de86eccaea9e041e9874967f60"
  >

    <input type="hidden" name="nwo" value="spring-projects/spring-framework" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
    </div>

  </div>
</div>




          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">


  <li>
    <a href="/login?return_to=%2Fspring-projects%2Fspring-framework"
    class="minibutton with-count js-toggler-target star-button tooltipped tooltipped-n"
    aria-label="You must be signed in to use this feature" rel="nofollow">
    <span class="octicon octicon-star"></span>Star
  </a>

    <a class="social-count js-social-count" href="/spring-projects/spring-framework/stargazers">
      3,085
    </a>

  </li>

    <li>
      <a href="/login?return_to=%2Fspring-projects%2Fspring-framework"
        class="minibutton with-count js-toggler-target fork-button tooltipped tooltipped-n"
        aria-label="You must be signed in to fork a repository" rel="nofollow">
        <span class="octicon octicon-git-branch"></span>Fork
      </a>
      <a href="/spring-projects/spring-framework/network" class="social-count">
        2,263
      </a>
    </li>
</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author">
            <a href="/spring-projects" class="url fn" itemprop="url" rel="author"><span itemprop="title">spring-projects</span></a>
          </span>
          <span class="repohead-name-divider">/</span>
          <strong><a href="/spring-projects/spring-framework" class="js-current-repository js-repo-home-link">spring-framework</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/spring-projects/spring-framework" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /spring-projects/spring-framework">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/spring-projects/spring-framework/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /spring-projects/spring-framework/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>65</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/spring-projects/spring-framework/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /spring-projects/spring-framework/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/spring-projects/spring-framework/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /spring-projects/spring-framework/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/spring-projects/spring-framework/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /spring-projects/spring-framework/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/spring-projects/spring-framework/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /spring-projects/spring-framework/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/spring-projects/spring-framework.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/spring-projects/spring-framework.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/spring-projects/spring-framework" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/spring-projects/spring-framework" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>


  <a href="http://windows.github.com" class="minibutton sidebar-button">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/spring-projects/spring-framework/archive/master.zip"
                   class="minibutton sidebar-button"
                   title="Download this repository as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:be08ef43bcfaa79d87a245e6ab5cb636 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/spring-projects/spring-framework/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/3.0.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="3.0.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.0.x">3.0.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/3.1.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="3.1.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.1.x">3.1.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/3.2.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="3.2.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.2.x">3.2.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/beanbuilder/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="beanbuilder"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="beanbuilder">beanbuilder</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/conversation/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="conversation"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="conversation">conversation</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/gh-pages/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="gh-pages"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="gh-pages">gh-pages</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/resource-handling/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="resource-handling"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="resource-handling">resource-handling</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.2.RELEASE">v4.0.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.1.RELEASE">v4.0.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RELEASE">v4.0.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RC2">v4.0.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RC1">v4.0.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M3/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.0.M3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M3">v4.0.0.M3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M2">v4.0.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v4.0.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M1">v4.0.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.8.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.8.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.8.RELEASE">v3.2.8.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.7.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.7.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.7.RELEASE">v3.2.7.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.6.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.6.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.6.RELEASE">v3.2.6.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.5.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.5.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.5.RELEASE">v3.2.5.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.4.RELEASE">v3.2.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.3.RELEASE">v3.2.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.2.RELEASE">v3.2.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.1.RELEASE">v3.2.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RELEASE">v3.2.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC2-A/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.0.RC2-A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC2-A">v3.2.0.RC2-A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC2">v3.2.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC1">v3.2.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.M2">v3.2.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.2.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.M1">v3.2.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.4.RELEASE">v3.1.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.3.RELEASE">v3.1.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.2.RELEASE">v3.1.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.1.RELEASE">v3.1.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RELEASE">v3.1.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RC2">v3.1.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RC1">v3.1.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.M2">v3.1.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.1.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.M1">v3.1.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.7.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.7.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.7.RELEASE">v3.0.7.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.6.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.6.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.6.RELEASE">v3.0.6.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.5.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.5.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.5.RELEASE">v3.0.5.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.4.RELEASE">v3.0.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.3.RELEASE">v3.0.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.2.RELEASE">v3.0.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE.A/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.1.RELEASE.A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE.A">v3.0.1.RELEASE.A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE-A/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.1.RELEASE-A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE-A">v3.0.1.RELEASE-A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE">v3.0.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RELEASE">v3.0.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC3/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.RC3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC3">v3.0.0.RC3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC2">v3.0.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC1">v3.0.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M4/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.M4"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M4">v3.0.0.M4</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M3/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.M3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M3">v3.0.0.M3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M2">v3.0.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java"
                 data-name="v3.0.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M1">v3.0.0.M1</a>
            </div> <!-- /.select-menu-item -->
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">spring-framework</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">spring-jdbc</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">main</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">java</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">org</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">springframework</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework/jdbc" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">jdbc</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework/jdbc/core" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">core</span></a></span><span class="separator"> / </span><strong class="final-path">RowCountCallbackHandler.java</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/spring-projects/spring-framework/contributors/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java">
    Fetching contributors…

    <div class="participation">
      <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32-EAF2F5.gif" width="16" /></p>
      <p class="loader-error">Cannot retrieve contributors at this time</p>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>139 lines (121 sloc)</span>
          <span class="meta-divider"></span>
        <span>4.287 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="http://windows.github.com" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
              <a class="minibutton disabled tooltipped tooltipped-w" href="#"
                 aria-label="You must be signed in to make or propose changes">Edit</a>
          <a href="/spring-projects/spring-framework/raw/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java" class="button minibutton " id="raw-url">Raw</a>
            <a href="/spring-projects/spring-framework/blame/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/spring-projects/spring-framework/commits/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/RowCountCallbackHandler.java" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->
          <a class="minibutton danger disabled empty-icon tooltipped tooltipped-w" href="#"
             aria-label="You must be signed in to make or propose changes">
          Delete
        </a>
      </div><!-- /.actions -->
    </div>
        <div class="blob-wrapper data type-java js-blob-data">
        <table class="file-code file-diff tab-size-8">
          <tr class="file-code-line">
            <td class="blob-line-nums">
              <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * Copyright 2002-2012 the original author or authors.</span></div><div class='line' id='LC3'><span class="cm"> *</span></div><div class='line' id='LC4'><span class="cm"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></div><div class='line' id='LC5'><span class="cm"> * you may not use this file except in compliance with the License.</span></div><div class='line' id='LC6'><span class="cm"> * You may obtain a copy of the License at</span></div><div class='line' id='LC7'><span class="cm"> *</span></div><div class='line' id='LC8'><span class="cm"> *      http://www.apache.org/licenses/LICENSE-2.0</span></div><div class='line' id='LC9'><span class="cm"> *</span></div><div class='line' id='LC10'><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></div><div class='line' id='LC11'><span class="cm"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></div><div class='line' id='LC12'><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></div><div class='line' id='LC13'><span class="cm"> * See the License for the specific language governing permissions and</span></div><div class='line' id='LC14'><span class="cm"> * limitations under the License.</span></div><div class='line' id='LC15'><span class="cm"> */</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="kn">package</span> <span class="n">org</span><span class="o">.</span><span class="na">springframework</span><span class="o">.</span><span class="na">jdbc</span><span class="o">.</span><span class="na">core</span><span class="o">;</span></div><div class='line' id='LC18'><br/></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">org.springframework.jdbc.support.JdbcUtils</span><span class="o">;</span></div><div class='line' id='LC20'><br/></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">java.sql.ResultSet</span><span class="o">;</span></div><div class='line' id='LC22'><span class="kn">import</span> <span class="nn">java.sql.ResultSetMetaData</span><span class="o">;</span></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">java.sql.SQLException</span><span class="o">;</span></div><div class='line' id='LC24'><br/></div><div class='line' id='LC25'><span class="cm">/**</span></div><div class='line' id='LC26'><span class="cm"> * Implementation of RowCallbackHandler. Convenient superclass for callback handlers.</span></div><div class='line' id='LC27'><span class="cm"> * An instance can only be used once.</span></div><div class='line' id='LC28'><span class="cm"> *</span></div><div class='line' id='LC29'><span class="cm"> * &lt;p&gt;We can either use this on its own (for example, in a test case, to ensure</span></div><div class='line' id='LC30'><span class="cm"> * that our result sets have valid dimensions), or use it as a superclass</span></div><div class='line' id='LC31'><span class="cm"> * for callback handlers that actually do something, and will benefit</span></div><div class='line' id='LC32'><span class="cm"> * from the dimension information it provides.</span></div><div class='line' id='LC33'><span class="cm"> *</span></div><div class='line' id='LC34'><span class="cm"> * &lt;p&gt;A usage example with JdbcTemplate:</span></div><div class='line' id='LC35'><span class="cm"> *</span></div><div class='line' id='LC36'><span class="cm"> * &lt;pre class=&quot;code&quot;&gt;JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);  // reusable object</span></div><div class='line' id='LC37'><span class="cm"> *</span></div><div class='line' id='LC38'><span class="cm"> * RowCountCallbackHandler countCallback = new RowCountCallbackHandler();  // not reusable</span></div><div class='line' id='LC39'><span class="cm"> * jdbcTemplate.query(&quot;select * from user&quot;, countCallback);</span></div><div class='line' id='LC40'><span class="cm"> * int rowCount = countCallback.getRowCount();&lt;/pre&gt;</span></div><div class='line' id='LC41'><span class="cm"> *</span></div><div class='line' id='LC42'><span class="cm"> * @author Rod Johnson</span></div><div class='line' id='LC43'><span class="cm"> * @since May 3, 2001</span></div><div class='line' id='LC44'><span class="cm"> */</span></div><div class='line' id='LC45'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">RowCountCallbackHandler</span> <span class="kd">implements</span> <span class="n">RowCallbackHandler</span> <span class="o">{</span></div><div class='line' id='LC46'><br/></div><div class='line' id='LC47'>	<span class="cm">/** Rows we&#39;ve seen so far */</span></div><div class='line' id='LC48'>	<span class="kd">private</span> <span class="kt">int</span> <span class="n">rowCount</span><span class="o">;</span></div><div class='line' id='LC49'><br/></div><div class='line' id='LC50'>	<span class="cm">/** Columns we&#39;ve seen so far */</span></div><div class='line' id='LC51'>	<span class="kd">private</span> <span class="kt">int</span> <span class="n">columnCount</span><span class="o">;</span></div><div class='line' id='LC52'><br/></div><div class='line' id='LC53'>	<span class="cm">/**</span></div><div class='line' id='LC54'><span class="cm">	 * Indexed from 0. Type (as in java.sql.Types) for the columns</span></div><div class='line' id='LC55'><span class="cm">	 * as returned by ResultSetMetaData object.</span></div><div class='line' id='LC56'><span class="cm">	 */</span></div><div class='line' id='LC57'>	<span class="kd">private</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">columnTypes</span><span class="o">;</span></div><div class='line' id='LC58'><br/></div><div class='line' id='LC59'>	<span class="cm">/**</span></div><div class='line' id='LC60'><span class="cm">	 * Indexed from 0. Column name as returned by ResultSetMetaData object.</span></div><div class='line' id='LC61'><span class="cm">	 */</span></div><div class='line' id='LC62'>	<span class="kd">private</span> <span class="n">String</span><span class="o">[]</span> <span class="n">columnNames</span><span class="o">;</span></div><div class='line' id='LC63'><br/></div><div class='line' id='LC64'><br/></div><div class='line' id='LC65'>	<span class="cm">/**</span></div><div class='line' id='LC66'><span class="cm">	 * Implementation of ResultSetCallbackHandler.</span></div><div class='line' id='LC67'><span class="cm">	 * Work out column size if this is the first row, otherwise just count rows.</span></div><div class='line' id='LC68'><span class="cm">	 * &lt;p&gt;Subclasses can perform custom extraction or processing</span></div><div class='line' id='LC69'><span class="cm">	 * by overriding the {@code processRow(ResultSet, int)} method.</span></div><div class='line' id='LC70'><span class="cm">	 * @see #processRow(java.sql.ResultSet, int)</span></div><div class='line' id='LC71'><span class="cm">	 */</span></div><div class='line' id='LC72'>	<span class="nd">@Override</span></div><div class='line' id='LC73'>	<span class="kd">public</span> <span class="kd">final</span> <span class="kt">void</span> <span class="nf">processRow</span><span class="o">(</span><span class="n">ResultSet</span> <span class="n">rs</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">SQLException</span> <span class="o">{</span></div><div class='line' id='LC74'>		<span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">rowCount</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC75'>			<span class="n">ResultSetMetaData</span> <span class="n">rsmd</span> <span class="o">=</span> <span class="n">rs</span><span class="o">.</span><span class="na">getMetaData</span><span class="o">();</span></div><div class='line' id='LC76'>			<span class="k">this</span><span class="o">.</span><span class="na">columnCount</span> <span class="o">=</span> <span class="n">rsmd</span><span class="o">.</span><span class="na">getColumnCount</span><span class="o">();</span></div><div class='line' id='LC77'>			<span class="k">this</span><span class="o">.</span><span class="na">columnTypes</span> <span class="o">=</span> <span class="k">new</span> <span class="kt">int</span><span class="o">[</span><span class="k">this</span><span class="o">.</span><span class="na">columnCount</span><span class="o">];</span></div><div class='line' id='LC78'>			<span class="k">this</span><span class="o">.</span><span class="na">columnNames</span> <span class="o">=</span> <span class="k">new</span> <span class="n">String</span><span class="o">[</span><span class="k">this</span><span class="o">.</span><span class="na">columnCount</span><span class="o">];</span></div><div class='line' id='LC79'>			<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="k">this</span><span class="o">.</span><span class="na">columnCount</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC80'>				<span class="k">this</span><span class="o">.</span><span class="na">columnTypes</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="n">rsmd</span><span class="o">.</span><span class="na">getColumnType</span><span class="o">(</span><span class="n">i</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC81'>				<span class="k">this</span><span class="o">.</span><span class="na">columnNames</span><span class="o">[</span><span class="n">i</span><span class="o">]</span> <span class="o">=</span> <span class="n">JdbcUtils</span><span class="o">.</span><span class="na">lookupColumnName</span><span class="o">(</span><span class="n">rsmd</span><span class="o">,</span> <span class="n">i</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC82'>			<span class="o">}</span></div><div class='line' id='LC83'>			<span class="c1">// could also get column names</span></div><div class='line' id='LC84'>		<span class="o">}</span></div><div class='line' id='LC85'>		<span class="n">processRow</span><span class="o">(</span><span class="n">rs</span><span class="o">,</span> <span class="k">this</span><span class="o">.</span><span class="na">rowCount</span><span class="o">++);</span></div><div class='line' id='LC86'>	<span class="o">}</span></div><div class='line' id='LC87'><br/></div><div class='line' id='LC88'>	<span class="cm">/**</span></div><div class='line' id='LC89'><span class="cm">	 * Subclasses may override this to perform custom extraction</span></div><div class='line' id='LC90'><span class="cm">	 * or processing. This class&#39;s implementation does nothing.</span></div><div class='line' id='LC91'><span class="cm">	 * @param rs ResultSet to extract data from. This method is</span></div><div class='line' id='LC92'><span class="cm">	 * invoked for each row</span></div><div class='line' id='LC93'><span class="cm">	 * @param rowNum number of the current row (starting from 0)</span></div><div class='line' id='LC94'><span class="cm">	 */</span></div><div class='line' id='LC95'>	<span class="kd">protected</span> <span class="kt">void</span> <span class="nf">processRow</span><span class="o">(</span><span class="n">ResultSet</span> <span class="n">rs</span><span class="o">,</span> <span class="kt">int</span> <span class="n">rowNum</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">SQLException</span> <span class="o">{</span></div><div class='line' id='LC96'>	<span class="o">}</span></div><div class='line' id='LC97'><br/></div><div class='line' id='LC98'><br/></div><div class='line' id='LC99'>	<span class="cm">/**</span></div><div class='line' id='LC100'><span class="cm">	 * Return the types of the columns as java.sql.Types constants</span></div><div class='line' id='LC101'><span class="cm">	 * Valid after processRow is invoked the first time.</span></div><div class='line' id='LC102'><span class="cm">	 * @return the types of the columns as java.sql.Types constants.</span></div><div class='line' id='LC103'><span class="cm">	 * &lt;b&gt;Indexed from 0 to n-1.&lt;/b&gt;</span></div><div class='line' id='LC104'><span class="cm">	 */</span></div><div class='line' id='LC105'>	<span class="kd">public</span> <span class="kd">final</span> <span class="kt">int</span><span class="o">[]</span> <span class="nf">getColumnTypes</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC106'>		<span class="k">return</span> <span class="n">columnTypes</span><span class="o">;</span></div><div class='line' id='LC107'>	<span class="o">}</span></div><div class='line' id='LC108'><br/></div><div class='line' id='LC109'>	<span class="cm">/**</span></div><div class='line' id='LC110'><span class="cm">	 * Return the names of the columns.</span></div><div class='line' id='LC111'><span class="cm">	 * Valid after processRow is invoked the first time.</span></div><div class='line' id='LC112'><span class="cm">	 * @return the names of the columns.</span></div><div class='line' id='LC113'><span class="cm">	 * &lt;b&gt;Indexed from 0 to n-1.&lt;/b&gt;</span></div><div class='line' id='LC114'><span class="cm">	 */</span></div><div class='line' id='LC115'>	<span class="kd">public</span> <span class="kd">final</span> <span class="n">String</span><span class="o">[]</span> <span class="nf">getColumnNames</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC116'>		<span class="k">return</span> <span class="n">columnNames</span><span class="o">;</span></div><div class='line' id='LC117'>	<span class="o">}</span></div><div class='line' id='LC118'><br/></div><div class='line' id='LC119'>	<span class="cm">/**</span></div><div class='line' id='LC120'><span class="cm">	 * Return the row count of this ResultSet</span></div><div class='line' id='LC121'><span class="cm">	 * Only valid after processing is complete</span></div><div class='line' id='LC122'><span class="cm">	 * @return the number of rows in this ResultSet</span></div><div class='line' id='LC123'><span class="cm">	 */</span></div><div class='line' id='LC124'>	<span class="kd">public</span> <span class="kd">final</span> <span class="kt">int</span> <span class="nf">getRowCount</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC125'>		<span class="k">return</span> <span class="n">rowCount</span><span class="o">;</span></div><div class='line' id='LC126'>	<span class="o">}</span></div><div class='line' id='LC127'><br/></div><div class='line' id='LC128'>	<span class="cm">/**</span></div><div class='line' id='LC129'><span class="cm">	 * Return the number of columns in this result set.</span></div><div class='line' id='LC130'><span class="cm">	 * Valid once we&#39;ve seen the first row,</span></div><div class='line' id='LC131'><span class="cm">	 * so subclasses can use it during processing</span></div><div class='line' id='LC132'><span class="cm">	 * @return the number of columns in this result set</span></div><div class='line' id='LC133'><span class="cm">	 */</span></div><div class='line' id='LC134'>	<span class="kd">public</span> <span class="kd">final</span> <span class="kt">int</span> <span class="nf">getColumnCount</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC135'>		<span class="k">return</span> <span class="n">columnCount</span><span class="o">;</span></div><div class='line' id='LC136'>	<span class="o">}</span></div><div class='line' id='LC137'><br/></div><div class='line' id='LC138'><span class="o">}</span></div></pre></div></td>
          </tr>
        </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.04238s from github-fe130-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>


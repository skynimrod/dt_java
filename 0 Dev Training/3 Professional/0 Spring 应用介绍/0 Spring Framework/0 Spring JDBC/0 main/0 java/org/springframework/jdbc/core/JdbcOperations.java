




<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>spring-framework/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java at master · spring-projects/spring-framework · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="spring-projects/spring-framework" name="twitter:title" /><meta content="spring-framework - The Spring Framework" name="twitter:description" /><meta content="https://2.gravatar.com/avatar/6f8a529bd100f4272a9ff1b8cdfbd26e?d=https%3A%2F%2Fidenticons.github.com%2Ff69a6111b59799984ef69ab92e633d83.png&amp;r=x&amp;s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://2.gravatar.com/avatar/6f8a529bd100f4272a9ff1b8cdfbd26e?d=https%3A%2F%2Fidenticons.github.com%2Ff69a6111b59799984ef69ab92e633d83.png&amp;r=x&amp;s=400" property="og:image" /><meta content="spring-projects/spring-framework" property="og:title" /><meta content="https://github.com/spring-projects/spring-framework" property="og:url" /><meta content="spring-framework - The Spring Framework" property="og:description" />

    <meta name="hostname" content="github-fe116-cp1-prd.iad.github.net">
    <meta name="ruby" content="ruby 2.1.0p0-github-tcmalloc (87c9373a41) [x86_64-linux]">
    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="6A786901:3BDF:26E13CB:53182D6C" name="octolytics-dimension-request_id" />
    

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="rtcw2YROF7Dn27ZT6eFB7+YTxHeb/yojn8THXAv4ni8=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-ce7ab9b7dbd81fa8f2eeff348bc97553a3eaf80c.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-729e3ebdf8b0ec6ed54532c398dc8bd48d25ea1f.css" media="all" rel="stylesheet" type="text/css" />
    
    


      <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-490867a148cf94468c141093ccd4e56ed2144eb9.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-a0f1f6f8ff5a4a3b8f453ec1095a25636480fbb8.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="7b67821226317b7dab62603ad6dd2719">

        <link data-pjax-transient rel='permalink' href='/spring-projects/spring-framework/blob/49d7bda72248b5a08fda3d42ed10d9e127396e6a/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java'>

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
      <a class="button signin" href="/login?return_to=%2Fspring-projects%2Fspring-framework%2Fblob%2Fmaster%2Fspring-jdbc%2Fsrc%2Fmain%2Fjava%2Forg%2Fspringframework%2Fjdbc%2Fcore%2FJdbcOperations.java">Sign in</a>
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
          


<!-- blob contrib key: blob_contributors:v21:1b561d44cc9704a3b96acb297df6b13c -->

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
              <a href="/spring-projects/spring-framework/blob/3.0.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="3.0.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.0.x">3.0.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/3.1.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="3.1.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.1.x">3.1.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/3.2.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="3.2.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.2.x">3.2.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/beanbuilder/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="beanbuilder"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="beanbuilder">beanbuilder</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/conversation/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="conversation"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="conversation">conversation</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/gh-pages/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="gh-pages"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="gh-pages">gh-pages</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/resource-handling/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
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
              <a href="/spring-projects/spring-framework/tree/v4.0.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.2.RELEASE">v4.0.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.1.RELEASE">v4.0.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RELEASE">v4.0.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RC2">v4.0.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RC1">v4.0.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M3/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.0.M3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M3">v4.0.0.M3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M2">v4.0.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v4.0.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M1">v4.0.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.8.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.8.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.8.RELEASE">v3.2.8.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.7.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.7.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.7.RELEASE">v3.2.7.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.6.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.6.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.6.RELEASE">v3.2.6.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.5.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.5.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.5.RELEASE">v3.2.5.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.4.RELEASE">v3.2.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.3.RELEASE">v3.2.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.2.RELEASE">v3.2.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.1.RELEASE">v3.2.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RELEASE">v3.2.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC2-A/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.0.RC2-A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC2-A">v3.2.0.RC2-A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC2">v3.2.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC1">v3.2.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.M2">v3.2.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.2.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.M1">v3.2.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.4.RELEASE">v3.1.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.3.RELEASE">v3.1.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.2.RELEASE">v3.1.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.1.RELEASE">v3.1.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RELEASE">v3.1.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RC2">v3.1.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RC1">v3.1.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.M2">v3.1.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.1.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.M1">v3.1.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.7.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.7.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.7.RELEASE">v3.0.7.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.6.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.6.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.6.RELEASE">v3.0.6.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.5.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.5.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.5.RELEASE">v3.0.5.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.4.RELEASE">v3.0.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.3.RELEASE">v3.0.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.2.RELEASE">v3.0.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE.A/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.1.RELEASE.A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE.A">v3.0.1.RELEASE.A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE-A/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.1.RELEASE-A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE-A">v3.0.1.RELEASE-A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE">v3.0.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RELEASE">v3.0.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC3/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.0.RC3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC3">v3.0.0.RC3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC2">v3.0.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC1">v3.0.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M4/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.0.M4"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M4">v3.0.0.M4</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M3/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.0.M3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M3">v3.0.0.M3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
                 data-name="v3.0.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M2">v3.0.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java"
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
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">spring-framework</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">spring-jdbc</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">main</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">java</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">org</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">springframework</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework/jdbc" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">jdbc</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework/jdbc/core" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">core</span></a></span><span class="separator"> / </span><strong class="final-path">JdbcOperations.java</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/spring-projects/spring-framework/contributors/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java">
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
          <span>1076 lines (999 sloc)</span>
          <span class="meta-divider"></span>
        <span>53.751 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="http://windows.github.com" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
              <a class="minibutton disabled tooltipped tooltipped-w" href="#"
                 aria-label="You must be signed in to make or propose changes">Edit</a>
          <a href="/spring-projects/spring-framework/raw/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java" class="button minibutton " id="raw-url">Raw</a>
            <a href="/spring-projects/spring-framework/blame/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/spring-projects/spring-framework/commits/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/JdbcOperations.java" class="button minibutton " rel="nofollow">History</a>
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
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
<span id="L402" rel="#L402">402</span>
<span id="L403" rel="#L403">403</span>
<span id="L404" rel="#L404">404</span>
<span id="L405" rel="#L405">405</span>
<span id="L406" rel="#L406">406</span>
<span id="L407" rel="#L407">407</span>
<span id="L408" rel="#L408">408</span>
<span id="L409" rel="#L409">409</span>
<span id="L410" rel="#L410">410</span>
<span id="L411" rel="#L411">411</span>
<span id="L412" rel="#L412">412</span>
<span id="L413" rel="#L413">413</span>
<span id="L414" rel="#L414">414</span>
<span id="L415" rel="#L415">415</span>
<span id="L416" rel="#L416">416</span>
<span id="L417" rel="#L417">417</span>
<span id="L418" rel="#L418">418</span>
<span id="L419" rel="#L419">419</span>
<span id="L420" rel="#L420">420</span>
<span id="L421" rel="#L421">421</span>
<span id="L422" rel="#L422">422</span>
<span id="L423" rel="#L423">423</span>
<span id="L424" rel="#L424">424</span>
<span id="L425" rel="#L425">425</span>
<span id="L426" rel="#L426">426</span>
<span id="L427" rel="#L427">427</span>
<span id="L428" rel="#L428">428</span>
<span id="L429" rel="#L429">429</span>
<span id="L430" rel="#L430">430</span>
<span id="L431" rel="#L431">431</span>
<span id="L432" rel="#L432">432</span>
<span id="L433" rel="#L433">433</span>
<span id="L434" rel="#L434">434</span>
<span id="L435" rel="#L435">435</span>
<span id="L436" rel="#L436">436</span>
<span id="L437" rel="#L437">437</span>
<span id="L438" rel="#L438">438</span>
<span id="L439" rel="#L439">439</span>
<span id="L440" rel="#L440">440</span>
<span id="L441" rel="#L441">441</span>
<span id="L442" rel="#L442">442</span>
<span id="L443" rel="#L443">443</span>
<span id="L444" rel="#L444">444</span>
<span id="L445" rel="#L445">445</span>
<span id="L446" rel="#L446">446</span>
<span id="L447" rel="#L447">447</span>
<span id="L448" rel="#L448">448</span>
<span id="L449" rel="#L449">449</span>
<span id="L450" rel="#L450">450</span>
<span id="L451" rel="#L451">451</span>
<span id="L452" rel="#L452">452</span>
<span id="L453" rel="#L453">453</span>
<span id="L454" rel="#L454">454</span>
<span id="L455" rel="#L455">455</span>
<span id="L456" rel="#L456">456</span>
<span id="L457" rel="#L457">457</span>
<span id="L458" rel="#L458">458</span>
<span id="L459" rel="#L459">459</span>
<span id="L460" rel="#L460">460</span>
<span id="L461" rel="#L461">461</span>
<span id="L462" rel="#L462">462</span>
<span id="L463" rel="#L463">463</span>
<span id="L464" rel="#L464">464</span>
<span id="L465" rel="#L465">465</span>
<span id="L466" rel="#L466">466</span>
<span id="L467" rel="#L467">467</span>
<span id="L468" rel="#L468">468</span>
<span id="L469" rel="#L469">469</span>
<span id="L470" rel="#L470">470</span>
<span id="L471" rel="#L471">471</span>
<span id="L472" rel="#L472">472</span>
<span id="L473" rel="#L473">473</span>
<span id="L474" rel="#L474">474</span>
<span id="L475" rel="#L475">475</span>
<span id="L476" rel="#L476">476</span>
<span id="L477" rel="#L477">477</span>
<span id="L478" rel="#L478">478</span>
<span id="L479" rel="#L479">479</span>
<span id="L480" rel="#L480">480</span>
<span id="L481" rel="#L481">481</span>
<span id="L482" rel="#L482">482</span>
<span id="L483" rel="#L483">483</span>
<span id="L484" rel="#L484">484</span>
<span id="L485" rel="#L485">485</span>
<span id="L486" rel="#L486">486</span>
<span id="L487" rel="#L487">487</span>
<span id="L488" rel="#L488">488</span>
<span id="L489" rel="#L489">489</span>
<span id="L490" rel="#L490">490</span>
<span id="L491" rel="#L491">491</span>
<span id="L492" rel="#L492">492</span>
<span id="L493" rel="#L493">493</span>
<span id="L494" rel="#L494">494</span>
<span id="L495" rel="#L495">495</span>
<span id="L496" rel="#L496">496</span>
<span id="L497" rel="#L497">497</span>
<span id="L498" rel="#L498">498</span>
<span id="L499" rel="#L499">499</span>
<span id="L500" rel="#L500">500</span>
<span id="L501" rel="#L501">501</span>
<span id="L502" rel="#L502">502</span>
<span id="L503" rel="#L503">503</span>
<span id="L504" rel="#L504">504</span>
<span id="L505" rel="#L505">505</span>
<span id="L506" rel="#L506">506</span>
<span id="L507" rel="#L507">507</span>
<span id="L508" rel="#L508">508</span>
<span id="L509" rel="#L509">509</span>
<span id="L510" rel="#L510">510</span>
<span id="L511" rel="#L511">511</span>
<span id="L512" rel="#L512">512</span>
<span id="L513" rel="#L513">513</span>
<span id="L514" rel="#L514">514</span>
<span id="L515" rel="#L515">515</span>
<span id="L516" rel="#L516">516</span>
<span id="L517" rel="#L517">517</span>
<span id="L518" rel="#L518">518</span>
<span id="L519" rel="#L519">519</span>
<span id="L520" rel="#L520">520</span>
<span id="L521" rel="#L521">521</span>
<span id="L522" rel="#L522">522</span>
<span id="L523" rel="#L523">523</span>
<span id="L524" rel="#L524">524</span>
<span id="L525" rel="#L525">525</span>
<span id="L526" rel="#L526">526</span>
<span id="L527" rel="#L527">527</span>
<span id="L528" rel="#L528">528</span>
<span id="L529" rel="#L529">529</span>
<span id="L530" rel="#L530">530</span>
<span id="L531" rel="#L531">531</span>
<span id="L532" rel="#L532">532</span>
<span id="L533" rel="#L533">533</span>
<span id="L534" rel="#L534">534</span>
<span id="L535" rel="#L535">535</span>
<span id="L536" rel="#L536">536</span>
<span id="L537" rel="#L537">537</span>
<span id="L538" rel="#L538">538</span>
<span id="L539" rel="#L539">539</span>
<span id="L540" rel="#L540">540</span>
<span id="L541" rel="#L541">541</span>
<span id="L542" rel="#L542">542</span>
<span id="L543" rel="#L543">543</span>
<span id="L544" rel="#L544">544</span>
<span id="L545" rel="#L545">545</span>
<span id="L546" rel="#L546">546</span>
<span id="L547" rel="#L547">547</span>
<span id="L548" rel="#L548">548</span>
<span id="L549" rel="#L549">549</span>
<span id="L550" rel="#L550">550</span>
<span id="L551" rel="#L551">551</span>
<span id="L552" rel="#L552">552</span>
<span id="L553" rel="#L553">553</span>
<span id="L554" rel="#L554">554</span>
<span id="L555" rel="#L555">555</span>
<span id="L556" rel="#L556">556</span>
<span id="L557" rel="#L557">557</span>
<span id="L558" rel="#L558">558</span>
<span id="L559" rel="#L559">559</span>
<span id="L560" rel="#L560">560</span>
<span id="L561" rel="#L561">561</span>
<span id="L562" rel="#L562">562</span>
<span id="L563" rel="#L563">563</span>
<span id="L564" rel="#L564">564</span>
<span id="L565" rel="#L565">565</span>
<span id="L566" rel="#L566">566</span>
<span id="L567" rel="#L567">567</span>
<span id="L568" rel="#L568">568</span>
<span id="L569" rel="#L569">569</span>
<span id="L570" rel="#L570">570</span>
<span id="L571" rel="#L571">571</span>
<span id="L572" rel="#L572">572</span>
<span id="L573" rel="#L573">573</span>
<span id="L574" rel="#L574">574</span>
<span id="L575" rel="#L575">575</span>
<span id="L576" rel="#L576">576</span>
<span id="L577" rel="#L577">577</span>
<span id="L578" rel="#L578">578</span>
<span id="L579" rel="#L579">579</span>
<span id="L580" rel="#L580">580</span>
<span id="L581" rel="#L581">581</span>
<span id="L582" rel="#L582">582</span>
<span id="L583" rel="#L583">583</span>
<span id="L584" rel="#L584">584</span>
<span id="L585" rel="#L585">585</span>
<span id="L586" rel="#L586">586</span>
<span id="L587" rel="#L587">587</span>
<span id="L588" rel="#L588">588</span>
<span id="L589" rel="#L589">589</span>
<span id="L590" rel="#L590">590</span>
<span id="L591" rel="#L591">591</span>
<span id="L592" rel="#L592">592</span>
<span id="L593" rel="#L593">593</span>
<span id="L594" rel="#L594">594</span>
<span id="L595" rel="#L595">595</span>
<span id="L596" rel="#L596">596</span>
<span id="L597" rel="#L597">597</span>
<span id="L598" rel="#L598">598</span>
<span id="L599" rel="#L599">599</span>
<span id="L600" rel="#L600">600</span>
<span id="L601" rel="#L601">601</span>
<span id="L602" rel="#L602">602</span>
<span id="L603" rel="#L603">603</span>
<span id="L604" rel="#L604">604</span>
<span id="L605" rel="#L605">605</span>
<span id="L606" rel="#L606">606</span>
<span id="L607" rel="#L607">607</span>
<span id="L608" rel="#L608">608</span>
<span id="L609" rel="#L609">609</span>
<span id="L610" rel="#L610">610</span>
<span id="L611" rel="#L611">611</span>
<span id="L612" rel="#L612">612</span>
<span id="L613" rel="#L613">613</span>
<span id="L614" rel="#L614">614</span>
<span id="L615" rel="#L615">615</span>
<span id="L616" rel="#L616">616</span>
<span id="L617" rel="#L617">617</span>
<span id="L618" rel="#L618">618</span>
<span id="L619" rel="#L619">619</span>
<span id="L620" rel="#L620">620</span>
<span id="L621" rel="#L621">621</span>
<span id="L622" rel="#L622">622</span>
<span id="L623" rel="#L623">623</span>
<span id="L624" rel="#L624">624</span>
<span id="L625" rel="#L625">625</span>
<span id="L626" rel="#L626">626</span>
<span id="L627" rel="#L627">627</span>
<span id="L628" rel="#L628">628</span>
<span id="L629" rel="#L629">629</span>
<span id="L630" rel="#L630">630</span>
<span id="L631" rel="#L631">631</span>
<span id="L632" rel="#L632">632</span>
<span id="L633" rel="#L633">633</span>
<span id="L634" rel="#L634">634</span>
<span id="L635" rel="#L635">635</span>
<span id="L636" rel="#L636">636</span>
<span id="L637" rel="#L637">637</span>
<span id="L638" rel="#L638">638</span>
<span id="L639" rel="#L639">639</span>
<span id="L640" rel="#L640">640</span>
<span id="L641" rel="#L641">641</span>
<span id="L642" rel="#L642">642</span>
<span id="L643" rel="#L643">643</span>
<span id="L644" rel="#L644">644</span>
<span id="L645" rel="#L645">645</span>
<span id="L646" rel="#L646">646</span>
<span id="L647" rel="#L647">647</span>
<span id="L648" rel="#L648">648</span>
<span id="L649" rel="#L649">649</span>
<span id="L650" rel="#L650">650</span>
<span id="L651" rel="#L651">651</span>
<span id="L652" rel="#L652">652</span>
<span id="L653" rel="#L653">653</span>
<span id="L654" rel="#L654">654</span>
<span id="L655" rel="#L655">655</span>
<span id="L656" rel="#L656">656</span>
<span id="L657" rel="#L657">657</span>
<span id="L658" rel="#L658">658</span>
<span id="L659" rel="#L659">659</span>
<span id="L660" rel="#L660">660</span>
<span id="L661" rel="#L661">661</span>
<span id="L662" rel="#L662">662</span>
<span id="L663" rel="#L663">663</span>
<span id="L664" rel="#L664">664</span>
<span id="L665" rel="#L665">665</span>
<span id="L666" rel="#L666">666</span>
<span id="L667" rel="#L667">667</span>
<span id="L668" rel="#L668">668</span>
<span id="L669" rel="#L669">669</span>
<span id="L670" rel="#L670">670</span>
<span id="L671" rel="#L671">671</span>
<span id="L672" rel="#L672">672</span>
<span id="L673" rel="#L673">673</span>
<span id="L674" rel="#L674">674</span>
<span id="L675" rel="#L675">675</span>
<span id="L676" rel="#L676">676</span>
<span id="L677" rel="#L677">677</span>
<span id="L678" rel="#L678">678</span>
<span id="L679" rel="#L679">679</span>
<span id="L680" rel="#L680">680</span>
<span id="L681" rel="#L681">681</span>
<span id="L682" rel="#L682">682</span>
<span id="L683" rel="#L683">683</span>
<span id="L684" rel="#L684">684</span>
<span id="L685" rel="#L685">685</span>
<span id="L686" rel="#L686">686</span>
<span id="L687" rel="#L687">687</span>
<span id="L688" rel="#L688">688</span>
<span id="L689" rel="#L689">689</span>
<span id="L690" rel="#L690">690</span>
<span id="L691" rel="#L691">691</span>
<span id="L692" rel="#L692">692</span>
<span id="L693" rel="#L693">693</span>
<span id="L694" rel="#L694">694</span>
<span id="L695" rel="#L695">695</span>
<span id="L696" rel="#L696">696</span>
<span id="L697" rel="#L697">697</span>
<span id="L698" rel="#L698">698</span>
<span id="L699" rel="#L699">699</span>
<span id="L700" rel="#L700">700</span>
<span id="L701" rel="#L701">701</span>
<span id="L702" rel="#L702">702</span>
<span id="L703" rel="#L703">703</span>
<span id="L704" rel="#L704">704</span>
<span id="L705" rel="#L705">705</span>
<span id="L706" rel="#L706">706</span>
<span id="L707" rel="#L707">707</span>
<span id="L708" rel="#L708">708</span>
<span id="L709" rel="#L709">709</span>
<span id="L710" rel="#L710">710</span>
<span id="L711" rel="#L711">711</span>
<span id="L712" rel="#L712">712</span>
<span id="L713" rel="#L713">713</span>
<span id="L714" rel="#L714">714</span>
<span id="L715" rel="#L715">715</span>
<span id="L716" rel="#L716">716</span>
<span id="L717" rel="#L717">717</span>
<span id="L718" rel="#L718">718</span>
<span id="L719" rel="#L719">719</span>
<span id="L720" rel="#L720">720</span>
<span id="L721" rel="#L721">721</span>
<span id="L722" rel="#L722">722</span>
<span id="L723" rel="#L723">723</span>
<span id="L724" rel="#L724">724</span>
<span id="L725" rel="#L725">725</span>
<span id="L726" rel="#L726">726</span>
<span id="L727" rel="#L727">727</span>
<span id="L728" rel="#L728">728</span>
<span id="L729" rel="#L729">729</span>
<span id="L730" rel="#L730">730</span>
<span id="L731" rel="#L731">731</span>
<span id="L732" rel="#L732">732</span>
<span id="L733" rel="#L733">733</span>
<span id="L734" rel="#L734">734</span>
<span id="L735" rel="#L735">735</span>
<span id="L736" rel="#L736">736</span>
<span id="L737" rel="#L737">737</span>
<span id="L738" rel="#L738">738</span>
<span id="L739" rel="#L739">739</span>
<span id="L740" rel="#L740">740</span>
<span id="L741" rel="#L741">741</span>
<span id="L742" rel="#L742">742</span>
<span id="L743" rel="#L743">743</span>
<span id="L744" rel="#L744">744</span>
<span id="L745" rel="#L745">745</span>
<span id="L746" rel="#L746">746</span>
<span id="L747" rel="#L747">747</span>
<span id="L748" rel="#L748">748</span>
<span id="L749" rel="#L749">749</span>
<span id="L750" rel="#L750">750</span>
<span id="L751" rel="#L751">751</span>
<span id="L752" rel="#L752">752</span>
<span id="L753" rel="#L753">753</span>
<span id="L754" rel="#L754">754</span>
<span id="L755" rel="#L755">755</span>
<span id="L756" rel="#L756">756</span>
<span id="L757" rel="#L757">757</span>
<span id="L758" rel="#L758">758</span>
<span id="L759" rel="#L759">759</span>
<span id="L760" rel="#L760">760</span>
<span id="L761" rel="#L761">761</span>
<span id="L762" rel="#L762">762</span>
<span id="L763" rel="#L763">763</span>
<span id="L764" rel="#L764">764</span>
<span id="L765" rel="#L765">765</span>
<span id="L766" rel="#L766">766</span>
<span id="L767" rel="#L767">767</span>
<span id="L768" rel="#L768">768</span>
<span id="L769" rel="#L769">769</span>
<span id="L770" rel="#L770">770</span>
<span id="L771" rel="#L771">771</span>
<span id="L772" rel="#L772">772</span>
<span id="L773" rel="#L773">773</span>
<span id="L774" rel="#L774">774</span>
<span id="L775" rel="#L775">775</span>
<span id="L776" rel="#L776">776</span>
<span id="L777" rel="#L777">777</span>
<span id="L778" rel="#L778">778</span>
<span id="L779" rel="#L779">779</span>
<span id="L780" rel="#L780">780</span>
<span id="L781" rel="#L781">781</span>
<span id="L782" rel="#L782">782</span>
<span id="L783" rel="#L783">783</span>
<span id="L784" rel="#L784">784</span>
<span id="L785" rel="#L785">785</span>
<span id="L786" rel="#L786">786</span>
<span id="L787" rel="#L787">787</span>
<span id="L788" rel="#L788">788</span>
<span id="L789" rel="#L789">789</span>
<span id="L790" rel="#L790">790</span>
<span id="L791" rel="#L791">791</span>
<span id="L792" rel="#L792">792</span>
<span id="L793" rel="#L793">793</span>
<span id="L794" rel="#L794">794</span>
<span id="L795" rel="#L795">795</span>
<span id="L796" rel="#L796">796</span>
<span id="L797" rel="#L797">797</span>
<span id="L798" rel="#L798">798</span>
<span id="L799" rel="#L799">799</span>
<span id="L800" rel="#L800">800</span>
<span id="L801" rel="#L801">801</span>
<span id="L802" rel="#L802">802</span>
<span id="L803" rel="#L803">803</span>
<span id="L804" rel="#L804">804</span>
<span id="L805" rel="#L805">805</span>
<span id="L806" rel="#L806">806</span>
<span id="L807" rel="#L807">807</span>
<span id="L808" rel="#L808">808</span>
<span id="L809" rel="#L809">809</span>
<span id="L810" rel="#L810">810</span>
<span id="L811" rel="#L811">811</span>
<span id="L812" rel="#L812">812</span>
<span id="L813" rel="#L813">813</span>
<span id="L814" rel="#L814">814</span>
<span id="L815" rel="#L815">815</span>
<span id="L816" rel="#L816">816</span>
<span id="L817" rel="#L817">817</span>
<span id="L818" rel="#L818">818</span>
<span id="L819" rel="#L819">819</span>
<span id="L820" rel="#L820">820</span>
<span id="L821" rel="#L821">821</span>
<span id="L822" rel="#L822">822</span>
<span id="L823" rel="#L823">823</span>
<span id="L824" rel="#L824">824</span>
<span id="L825" rel="#L825">825</span>
<span id="L826" rel="#L826">826</span>
<span id="L827" rel="#L827">827</span>
<span id="L828" rel="#L828">828</span>
<span id="L829" rel="#L829">829</span>
<span id="L830" rel="#L830">830</span>
<span id="L831" rel="#L831">831</span>
<span id="L832" rel="#L832">832</span>
<span id="L833" rel="#L833">833</span>
<span id="L834" rel="#L834">834</span>
<span id="L835" rel="#L835">835</span>
<span id="L836" rel="#L836">836</span>
<span id="L837" rel="#L837">837</span>
<span id="L838" rel="#L838">838</span>
<span id="L839" rel="#L839">839</span>
<span id="L840" rel="#L840">840</span>
<span id="L841" rel="#L841">841</span>
<span id="L842" rel="#L842">842</span>
<span id="L843" rel="#L843">843</span>
<span id="L844" rel="#L844">844</span>
<span id="L845" rel="#L845">845</span>
<span id="L846" rel="#L846">846</span>
<span id="L847" rel="#L847">847</span>
<span id="L848" rel="#L848">848</span>
<span id="L849" rel="#L849">849</span>
<span id="L850" rel="#L850">850</span>
<span id="L851" rel="#L851">851</span>
<span id="L852" rel="#L852">852</span>
<span id="L853" rel="#L853">853</span>
<span id="L854" rel="#L854">854</span>
<span id="L855" rel="#L855">855</span>
<span id="L856" rel="#L856">856</span>
<span id="L857" rel="#L857">857</span>
<span id="L858" rel="#L858">858</span>
<span id="L859" rel="#L859">859</span>
<span id="L860" rel="#L860">860</span>
<span id="L861" rel="#L861">861</span>
<span id="L862" rel="#L862">862</span>
<span id="L863" rel="#L863">863</span>
<span id="L864" rel="#L864">864</span>
<span id="L865" rel="#L865">865</span>
<span id="L866" rel="#L866">866</span>
<span id="L867" rel="#L867">867</span>
<span id="L868" rel="#L868">868</span>
<span id="L869" rel="#L869">869</span>
<span id="L870" rel="#L870">870</span>
<span id="L871" rel="#L871">871</span>
<span id="L872" rel="#L872">872</span>
<span id="L873" rel="#L873">873</span>
<span id="L874" rel="#L874">874</span>
<span id="L875" rel="#L875">875</span>
<span id="L876" rel="#L876">876</span>
<span id="L877" rel="#L877">877</span>
<span id="L878" rel="#L878">878</span>
<span id="L879" rel="#L879">879</span>
<span id="L880" rel="#L880">880</span>
<span id="L881" rel="#L881">881</span>
<span id="L882" rel="#L882">882</span>
<span id="L883" rel="#L883">883</span>
<span id="L884" rel="#L884">884</span>
<span id="L885" rel="#L885">885</span>
<span id="L886" rel="#L886">886</span>
<span id="L887" rel="#L887">887</span>
<span id="L888" rel="#L888">888</span>
<span id="L889" rel="#L889">889</span>
<span id="L890" rel="#L890">890</span>
<span id="L891" rel="#L891">891</span>
<span id="L892" rel="#L892">892</span>
<span id="L893" rel="#L893">893</span>
<span id="L894" rel="#L894">894</span>
<span id="L895" rel="#L895">895</span>
<span id="L896" rel="#L896">896</span>
<span id="L897" rel="#L897">897</span>
<span id="L898" rel="#L898">898</span>
<span id="L899" rel="#L899">899</span>
<span id="L900" rel="#L900">900</span>
<span id="L901" rel="#L901">901</span>
<span id="L902" rel="#L902">902</span>
<span id="L903" rel="#L903">903</span>
<span id="L904" rel="#L904">904</span>
<span id="L905" rel="#L905">905</span>
<span id="L906" rel="#L906">906</span>
<span id="L907" rel="#L907">907</span>
<span id="L908" rel="#L908">908</span>
<span id="L909" rel="#L909">909</span>
<span id="L910" rel="#L910">910</span>
<span id="L911" rel="#L911">911</span>
<span id="L912" rel="#L912">912</span>
<span id="L913" rel="#L913">913</span>
<span id="L914" rel="#L914">914</span>
<span id="L915" rel="#L915">915</span>
<span id="L916" rel="#L916">916</span>
<span id="L917" rel="#L917">917</span>
<span id="L918" rel="#L918">918</span>
<span id="L919" rel="#L919">919</span>
<span id="L920" rel="#L920">920</span>
<span id="L921" rel="#L921">921</span>
<span id="L922" rel="#L922">922</span>
<span id="L923" rel="#L923">923</span>
<span id="L924" rel="#L924">924</span>
<span id="L925" rel="#L925">925</span>
<span id="L926" rel="#L926">926</span>
<span id="L927" rel="#L927">927</span>
<span id="L928" rel="#L928">928</span>
<span id="L929" rel="#L929">929</span>
<span id="L930" rel="#L930">930</span>
<span id="L931" rel="#L931">931</span>
<span id="L932" rel="#L932">932</span>
<span id="L933" rel="#L933">933</span>
<span id="L934" rel="#L934">934</span>
<span id="L935" rel="#L935">935</span>
<span id="L936" rel="#L936">936</span>
<span id="L937" rel="#L937">937</span>
<span id="L938" rel="#L938">938</span>
<span id="L939" rel="#L939">939</span>
<span id="L940" rel="#L940">940</span>
<span id="L941" rel="#L941">941</span>
<span id="L942" rel="#L942">942</span>
<span id="L943" rel="#L943">943</span>
<span id="L944" rel="#L944">944</span>
<span id="L945" rel="#L945">945</span>
<span id="L946" rel="#L946">946</span>
<span id="L947" rel="#L947">947</span>
<span id="L948" rel="#L948">948</span>
<span id="L949" rel="#L949">949</span>
<span id="L950" rel="#L950">950</span>
<span id="L951" rel="#L951">951</span>
<span id="L952" rel="#L952">952</span>
<span id="L953" rel="#L953">953</span>
<span id="L954" rel="#L954">954</span>
<span id="L955" rel="#L955">955</span>
<span id="L956" rel="#L956">956</span>
<span id="L957" rel="#L957">957</span>
<span id="L958" rel="#L958">958</span>
<span id="L959" rel="#L959">959</span>
<span id="L960" rel="#L960">960</span>
<span id="L961" rel="#L961">961</span>
<span id="L962" rel="#L962">962</span>
<span id="L963" rel="#L963">963</span>
<span id="L964" rel="#L964">964</span>
<span id="L965" rel="#L965">965</span>
<span id="L966" rel="#L966">966</span>
<span id="L967" rel="#L967">967</span>
<span id="L968" rel="#L968">968</span>
<span id="L969" rel="#L969">969</span>
<span id="L970" rel="#L970">970</span>
<span id="L971" rel="#L971">971</span>
<span id="L972" rel="#L972">972</span>
<span id="L973" rel="#L973">973</span>
<span id="L974" rel="#L974">974</span>
<span id="L975" rel="#L975">975</span>
<span id="L976" rel="#L976">976</span>
<span id="L977" rel="#L977">977</span>
<span id="L978" rel="#L978">978</span>
<span id="L979" rel="#L979">979</span>
<span id="L980" rel="#L980">980</span>
<span id="L981" rel="#L981">981</span>
<span id="L982" rel="#L982">982</span>
<span id="L983" rel="#L983">983</span>
<span id="L984" rel="#L984">984</span>
<span id="L985" rel="#L985">985</span>
<span id="L986" rel="#L986">986</span>
<span id="L987" rel="#L987">987</span>
<span id="L988" rel="#L988">988</span>
<span id="L989" rel="#L989">989</span>
<span id="L990" rel="#L990">990</span>
<span id="L991" rel="#L991">991</span>
<span id="L992" rel="#L992">992</span>
<span id="L993" rel="#L993">993</span>
<span id="L994" rel="#L994">994</span>
<span id="L995" rel="#L995">995</span>
<span id="L996" rel="#L996">996</span>
<span id="L997" rel="#L997">997</span>
<span id="L998" rel="#L998">998</span>
<span id="L999" rel="#L999">999</span>
<span id="L1000" rel="#L1000">1000</span>
<span id="L1001" rel="#L1001">1001</span>
<span id="L1002" rel="#L1002">1002</span>
<span id="L1003" rel="#L1003">1003</span>
<span id="L1004" rel="#L1004">1004</span>
<span id="L1005" rel="#L1005">1005</span>
<span id="L1006" rel="#L1006">1006</span>
<span id="L1007" rel="#L1007">1007</span>
<span id="L1008" rel="#L1008">1008</span>
<span id="L1009" rel="#L1009">1009</span>
<span id="L1010" rel="#L1010">1010</span>
<span id="L1011" rel="#L1011">1011</span>
<span id="L1012" rel="#L1012">1012</span>
<span id="L1013" rel="#L1013">1013</span>
<span id="L1014" rel="#L1014">1014</span>
<span id="L1015" rel="#L1015">1015</span>
<span id="L1016" rel="#L1016">1016</span>
<span id="L1017" rel="#L1017">1017</span>
<span id="L1018" rel="#L1018">1018</span>
<span id="L1019" rel="#L1019">1019</span>
<span id="L1020" rel="#L1020">1020</span>
<span id="L1021" rel="#L1021">1021</span>
<span id="L1022" rel="#L1022">1022</span>
<span id="L1023" rel="#L1023">1023</span>
<span id="L1024" rel="#L1024">1024</span>
<span id="L1025" rel="#L1025">1025</span>
<span id="L1026" rel="#L1026">1026</span>
<span id="L1027" rel="#L1027">1027</span>
<span id="L1028" rel="#L1028">1028</span>
<span id="L1029" rel="#L1029">1029</span>
<span id="L1030" rel="#L1030">1030</span>
<span id="L1031" rel="#L1031">1031</span>
<span id="L1032" rel="#L1032">1032</span>
<span id="L1033" rel="#L1033">1033</span>
<span id="L1034" rel="#L1034">1034</span>
<span id="L1035" rel="#L1035">1035</span>
<span id="L1036" rel="#L1036">1036</span>
<span id="L1037" rel="#L1037">1037</span>
<span id="L1038" rel="#L1038">1038</span>
<span id="L1039" rel="#L1039">1039</span>
<span id="L1040" rel="#L1040">1040</span>
<span id="L1041" rel="#L1041">1041</span>
<span id="L1042" rel="#L1042">1042</span>
<span id="L1043" rel="#L1043">1043</span>
<span id="L1044" rel="#L1044">1044</span>
<span id="L1045" rel="#L1045">1045</span>
<span id="L1046" rel="#L1046">1046</span>
<span id="L1047" rel="#L1047">1047</span>
<span id="L1048" rel="#L1048">1048</span>
<span id="L1049" rel="#L1049">1049</span>
<span id="L1050" rel="#L1050">1050</span>
<span id="L1051" rel="#L1051">1051</span>
<span id="L1052" rel="#L1052">1052</span>
<span id="L1053" rel="#L1053">1053</span>
<span id="L1054" rel="#L1054">1054</span>
<span id="L1055" rel="#L1055">1055</span>
<span id="L1056" rel="#L1056">1056</span>
<span id="L1057" rel="#L1057">1057</span>
<span id="L1058" rel="#L1058">1058</span>
<span id="L1059" rel="#L1059">1059</span>
<span id="L1060" rel="#L1060">1060</span>
<span id="L1061" rel="#L1061">1061</span>
<span id="L1062" rel="#L1062">1062</span>
<span id="L1063" rel="#L1063">1063</span>
<span id="L1064" rel="#L1064">1064</span>
<span id="L1065" rel="#L1065">1065</span>
<span id="L1066" rel="#L1066">1066</span>
<span id="L1067" rel="#L1067">1067</span>
<span id="L1068" rel="#L1068">1068</span>
<span id="L1069" rel="#L1069">1069</span>
<span id="L1070" rel="#L1070">1070</span>
<span id="L1071" rel="#L1071">1071</span>
<span id="L1072" rel="#L1072">1072</span>
<span id="L1073" rel="#L1073">1073</span>
<span id="L1074" rel="#L1074">1074</span>
<span id="L1075" rel="#L1075">1075</span>

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * Copyright 2002-2014 the original author or authors.</span></div><div class='line' id='LC3'><span class="cm"> *</span></div><div class='line' id='LC4'><span class="cm"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></div><div class='line' id='LC5'><span class="cm"> * you may not use this file except in compliance with the License.</span></div><div class='line' id='LC6'><span class="cm"> * You may obtain a copy of the License at</span></div><div class='line' id='LC7'><span class="cm"> *</span></div><div class='line' id='LC8'><span class="cm"> *      http://www.apache.org/licenses/LICENSE-2.0</span></div><div class='line' id='LC9'><span class="cm"> *</span></div><div class='line' id='LC10'><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></div><div class='line' id='LC11'><span class="cm"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></div><div class='line' id='LC12'><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></div><div class='line' id='LC13'><span class="cm"> * See the License for the specific language governing permissions and</span></div><div class='line' id='LC14'><span class="cm"> * limitations under the License.</span></div><div class='line' id='LC15'><span class="cm"> */</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="kn">package</span> <span class="n">org</span><span class="o">.</span><span class="na">springframework</span><span class="o">.</span><span class="na">jdbc</span><span class="o">.</span><span class="na">core</span><span class="o">;</span></div><div class='line' id='LC18'><br/></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">java.util.Collection</span><span class="o">;</span></div><div class='line' id='LC20'><span class="kn">import</span> <span class="nn">java.util.List</span><span class="o">;</span></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">java.util.Map</span><span class="o">;</span></div><div class='line' id='LC22'><br/></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">org.springframework.dao.DataAccessException</span><span class="o">;</span></div><div class='line' id='LC24'><span class="kn">import</span> <span class="nn">org.springframework.dao.IncorrectResultSizeDataAccessException</span><span class="o">;</span></div><div class='line' id='LC25'><span class="kn">import</span> <span class="nn">org.springframework.jdbc.support.KeyHolder</span><span class="o">;</span></div><div class='line' id='LC26'><span class="kn">import</span> <span class="nn">org.springframework.jdbc.support.rowset.SqlRowSet</span><span class="o">;</span></div><div class='line' id='LC27'><br/></div><div class='line' id='LC28'><span class="cm">/**</span></div><div class='line' id='LC29'><span class="cm"> * Interface specifying a basic set of JDBC operations.</span></div><div class='line' id='LC30'><span class="cm"> * Implemented by {@link JdbcTemplate}. Not often used directly, but a useful</span></div><div class='line' id='LC31'><span class="cm"> * option to enhance testability, as it can easily be mocked or stubbed.</span></div><div class='line' id='LC32'><span class="cm"> *</span></div><div class='line' id='LC33'><span class="cm"> * &lt;p&gt;Alternatively, the standard JDBC infrastructure can be mocked.</span></div><div class='line' id='LC34'><span class="cm"> * However, mocking this interface constitutes significantly less work.</span></div><div class='line' id='LC35'><span class="cm"> * As an alternative to a mock objects approach to testing data access code,</span></div><div class='line' id='LC36'><span class="cm"> * consider the powerful integration testing support provided in the</span></div><div class='line' id='LC37'><span class="cm"> * {@code org.springframework.test} package, shipped in</span></div><div class='line' id='LC38'><span class="cm"> * {@code spring-test.jar}.</span></div><div class='line' id='LC39'><span class="cm"> *</span></div><div class='line' id='LC40'><span class="cm"> * @author Rod Johnson</span></div><div class='line' id='LC41'><span class="cm"> * @author Juergen Hoeller</span></div><div class='line' id='LC42'><span class="cm"> * @see JdbcTemplate</span></div><div class='line' id='LC43'><span class="cm"> */</span></div><div class='line' id='LC44'><span class="kd">public</span> <span class="kd">interface</span> <span class="nc">JdbcOperations</span> <span class="o">{</span></div><div class='line' id='LC45'><br/></div><div class='line' id='LC46'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC47'>	<span class="c1">// Methods dealing with a plain java.sql.Connection</span></div><div class='line' id='LC48'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC49'><br/></div><div class='line' id='LC50'>	<span class="cm">/**</span></div><div class='line' id='LC51'><span class="cm">	 * Execute a JDBC data access operation, implemented as callback action</span></div><div class='line' id='LC52'><span class="cm">	 * working on a JDBC Connection. This allows for implementing arbitrary</span></div><div class='line' id='LC53'><span class="cm">	 * data access operations, within Spring&#39;s managed JDBC environment:</span></div><div class='line' id='LC54'><span class="cm">	 * that is, participating in Spring-managed transactions and converting</span></div><div class='line' id='LC55'><span class="cm">	 * JDBC SQLExceptions into Spring&#39;s DataAccessException hierarchy.</span></div><div class='line' id='LC56'><span class="cm">	 * &lt;p&gt;The callback action can return a result object, for example a</span></div><div class='line' id='LC57'><span class="cm">	 * domain object or a collection of domain objects.</span></div><div class='line' id='LC58'><span class="cm">	 * @param action the callback object that specifies the action</span></div><div class='line' id='LC59'><span class="cm">	 * @return a result object returned by the action, or {@code null}</span></div><div class='line' id='LC60'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC61'><span class="cm">	 */</span></div><div class='line' id='LC62'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">execute</span><span class="o">(</span><span class="n">ConnectionCallback</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">action</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC63'><br/></div><div class='line' id='LC64'><br/></div><div class='line' id='LC65'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC66'>	<span class="c1">// Methods dealing with static SQL (java.sql.Statement)</span></div><div class='line' id='LC67'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC68'><br/></div><div class='line' id='LC69'>	<span class="cm">/**</span></div><div class='line' id='LC70'><span class="cm">	 * Execute a JDBC data access operation, implemented as callback action</span></div><div class='line' id='LC71'><span class="cm">	 * working on a JDBC Statement. This allows for implementing arbitrary data</span></div><div class='line' id='LC72'><span class="cm">	 * access operations on a single Statement, within Spring&#39;s managed JDBC</span></div><div class='line' id='LC73'><span class="cm">	 * environment: that is, participating in Spring-managed transactions and</span></div><div class='line' id='LC74'><span class="cm">	 * converting JDBC SQLExceptions into Spring&#39;s DataAccessException hierarchy.</span></div><div class='line' id='LC75'><span class="cm">	 * &lt;p&gt;The callback action can return a result object, for example a</span></div><div class='line' id='LC76'><span class="cm">	 * domain object or a collection of domain objects.</span></div><div class='line' id='LC77'><span class="cm">	 * @param action callback object that specifies the action</span></div><div class='line' id='LC78'><span class="cm">	 * @return a result object returned by the action, or {@code null}</span></div><div class='line' id='LC79'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC80'><span class="cm">	 */</span></div><div class='line' id='LC81'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">execute</span><span class="o">(</span><span class="n">StatementCallback</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">action</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC82'><br/></div><div class='line' id='LC83'>	<span class="cm">/**</span></div><div class='line' id='LC84'><span class="cm">	 * Issue a single SQL execute, typically a DDL statement.</span></div><div class='line' id='LC85'><span class="cm">	 * @param sql static SQL to execute</span></div><div class='line' id='LC86'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC87'><span class="cm">	 */</span></div><div class='line' id='LC88'>	<span class="kt">void</span> <span class="nf">execute</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC89'><br/></div><div class='line' id='LC90'>	<span class="cm">/**</span></div><div class='line' id='LC91'><span class="cm">	 * Execute a query given static SQL, reading the ResultSet with a</span></div><div class='line' id='LC92'><span class="cm">	 * ResultSetExtractor.</span></div><div class='line' id='LC93'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC94'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC95'><span class="cm">	 * {@code query} method with {@code null} as argument array.</span></div><div class='line' id='LC96'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC97'><span class="cm">	 * @param rse object that will extract all rows of results</span></div><div class='line' id='LC98'><span class="cm">	 * @return an arbitrary result object, as returned by the ResultSetExtractor</span></div><div class='line' id='LC99'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC100'><span class="cm">	 * @see #query(String, Object[], ResultSetExtractor)</span></div><div class='line' id='LC101'><span class="cm">	 */</span></div><div class='line' id='LC102'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">ResultSetExtractor</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rse</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC103'><br/></div><div class='line' id='LC104'>	<span class="cm">/**</span></div><div class='line' id='LC105'><span class="cm">	 * Execute a query given static SQL, reading the ResultSet on a per-row</span></div><div class='line' id='LC106'><span class="cm">	 * basis with a RowCallbackHandler.</span></div><div class='line' id='LC107'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC108'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC109'><span class="cm">	 * {@code query} method with {@code null} as argument array.</span></div><div class='line' id='LC110'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC111'><span class="cm">	 * @param rch object that will extract results, one row at a time</span></div><div class='line' id='LC112'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC113'><span class="cm">	 * @see #query(String, Object[], RowCallbackHandler)</span></div><div class='line' id='LC114'><span class="cm">	 */</span></div><div class='line' id='LC115'>	<span class="kt">void</span> <span class="nf">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">RowCallbackHandler</span> <span class="n">rch</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC116'><br/></div><div class='line' id='LC117'>	<span class="cm">/**</span></div><div class='line' id='LC118'><span class="cm">	 * Execute a query given static SQL, mapping each row to a Java object</span></div><div class='line' id='LC119'><span class="cm">	 * via a RowMapper.</span></div><div class='line' id='LC120'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC121'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC122'><span class="cm">	 * {@code query} method with {@code null} as argument array.</span></div><div class='line' id='LC123'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC124'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC125'><span class="cm">	 * @return the result List, containing mapped objects</span></div><div class='line' id='LC126'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC127'><span class="cm">	 * @see #query(String, Object[], RowMapper)</span></div><div class='line' id='LC128'><span class="cm">	 */</span></div><div class='line' id='LC129'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC130'><br/></div><div class='line' id='LC131'>	<span class="cm">/**</span></div><div class='line' id='LC132'><span class="cm">	 * Execute a query given static SQL, mapping a single result row to a Java</span></div><div class='line' id='LC133'><span class="cm">	 * object via a RowMapper.</span></div><div class='line' id='LC134'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC135'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC136'><span class="cm">	 * {@link #queryForObject(String, RowMapper, Object...)} method with</span></div><div class='line' id='LC137'><span class="cm">	 * {@code null} as argument array.</span></div><div class='line' id='LC138'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC139'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC140'><span class="cm">	 * @return the single mapped object</span></div><div class='line' id='LC141'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not</span></div><div class='line' id='LC142'><span class="cm">	 * return exactly one row</span></div><div class='line' id='LC143'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC144'><span class="cm">	 * @see #queryForObject(String, Object[], RowMapper)</span></div><div class='line' id='LC145'><span class="cm">	 */</span></div><div class='line' id='LC146'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC147'><br/></div><div class='line' id='LC148'>	<span class="cm">/**</span></div><div class='line' id='LC149'><span class="cm">	 * Execute a query for a result object, given static SQL.</span></div><div class='line' id='LC150'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC151'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC152'><span class="cm">	 * {@link #queryForObject(String, Class, Object...)} method with</span></div><div class='line' id='LC153'><span class="cm">	 * {@code null} as argument array.</span></div><div class='line' id='LC154'><span class="cm">	 * &lt;p&gt;This method is useful for running static SQL with a known outcome.</span></div><div class='line' id='LC155'><span class="cm">	 * The query is expected to be a single row/single column query; the returned</span></div><div class='line' id='LC156'><span class="cm">	 * result will be directly mapped to the corresponding object type.</span></div><div class='line' id='LC157'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC158'><span class="cm">	 * @param requiredType the type that the result object is expected to match</span></div><div class='line' id='LC159'><span class="cm">	 * @return the result object of the required type, or {@code null} in case of SQL NULL</span></div><div class='line' id='LC160'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC161'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC162'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC163'><span class="cm">	 * @see #queryForObject(String, Object[], Class)</span></div><div class='line' id='LC164'><span class="cm">	 */</span></div><div class='line' id='LC165'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">requiredType</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC166'><br/></div><div class='line' id='LC167'>	<span class="cm">/**</span></div><div class='line' id='LC168'><span class="cm">	 * Execute a query for a result Map, given static SQL.</span></div><div class='line' id='LC169'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC170'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC171'><span class="cm">	 * {@link #queryForMap(String, Object...)} method with {@code null}</span></div><div class='line' id='LC172'><span class="cm">	 * as argument array.</span></div><div class='line' id='LC173'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row query; the result row will be</span></div><div class='line' id='LC174'><span class="cm">	 * mapped to a Map (one entry for each column, using the column name as the key).</span></div><div class='line' id='LC175'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC176'><span class="cm">	 * @return the result Map (one entry for each column, using the</span></div><div class='line' id='LC177'><span class="cm">	 * column name as the key)</span></div><div class='line' id='LC178'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not</span></div><div class='line' id='LC179'><span class="cm">	 * return exactly one row</span></div><div class='line' id='LC180'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC181'><span class="cm">	 * @see #queryForMap(String, Object[])</span></div><div class='line' id='LC182'><span class="cm">	 * @see ColumnMapRowMapper</span></div><div class='line' id='LC183'><span class="cm">	 */</span></div><div class='line' id='LC184'>	<span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">queryForMap</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC185'><br/></div><div class='line' id='LC186'>	<span class="cm">/**</span></div><div class='line' id='LC187'><span class="cm">	 * Execute a query that results in a long value, given static SQL.</span></div><div class='line' id='LC188'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC189'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC190'><span class="cm">	 * {@code queryForLong} method with {@code null} as argument array.</span></div><div class='line' id='LC191'><span class="cm">	 * &lt;p&gt;This method is useful for running static SQL with a known outcome.</span></div><div class='line' id='LC192'><span class="cm">	 * The query is expected to be a single row/single column query that results</span></div><div class='line' id='LC193'><span class="cm">	 * in a long value.</span></div><div class='line' id='LC194'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC195'><span class="cm">	 * @return the long value, or 0 in case of SQL NULL</span></div><div class='line' id='LC196'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC197'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC198'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC199'><span class="cm">	 * @see #queryForLong(String, Object[])</span></div><div class='line' id='LC200'><span class="cm">	 * @deprecated in favor of {@link #queryForObject(String, Class)}</span></div><div class='line' id='LC201'><span class="cm">	 */</span></div><div class='line' id='LC202'>	<span class="nd">@Deprecated</span></div><div class='line' id='LC203'>	<span class="kt">long</span> <span class="nf">queryForLong</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC204'><br/></div><div class='line' id='LC205'>	<span class="cm">/**</span></div><div class='line' id='LC206'><span class="cm">	 * Execute a query that results in an int value, given static SQL.</span></div><div class='line' id='LC207'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC208'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC209'><span class="cm">	 * {@code queryForInt} method with {@code null} as argument array.</span></div><div class='line' id='LC210'><span class="cm">	 * &lt;p&gt;This method is useful for running static SQL with a known outcome.</span></div><div class='line' id='LC211'><span class="cm">	 * The query is expected to be a single row/single column query that results</span></div><div class='line' id='LC212'><span class="cm">	 * in an int value.</span></div><div class='line' id='LC213'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC214'><span class="cm">	 * @return the int value, or 0 in case of SQL NULL</span></div><div class='line' id='LC215'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC216'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC217'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC218'><span class="cm">	 * @see #queryForInt(String, Object[])</span></div><div class='line' id='LC219'><span class="cm">	 * @deprecated in favor of {@link #queryForObject(String, Class)}</span></div><div class='line' id='LC220'><span class="cm">	 */</span></div><div class='line' id='LC221'>	<span class="nd">@Deprecated</span></div><div class='line' id='LC222'>	<span class="kt">int</span> <span class="nf">queryForInt</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC223'><br/></div><div class='line' id='LC224'>	<span class="cm">/**</span></div><div class='line' id='LC225'><span class="cm">	 * Execute a query for a result list, given static SQL.</span></div><div class='line' id='LC226'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC227'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC228'><span class="cm">	 * {@code queryForList} method with {@code null} as argument array.</span></div><div class='line' id='LC229'><span class="cm">	 * &lt;p&gt;The results will be mapped to a List (one entry for each row) of</span></div><div class='line' id='LC230'><span class="cm">	 * result objects, each of them matching the specified element type.</span></div><div class='line' id='LC231'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC232'><span class="cm">	 * @param elementType the required type of element in the result list</span></div><div class='line' id='LC233'><span class="cm">	 * (for example, {@code Integer.class})</span></div><div class='line' id='LC234'><span class="cm">	 * @return a List of objects that match the specified element type</span></div><div class='line' id='LC235'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC236'><span class="cm">	 * @see #queryForList(String, Object[], Class)</span></div><div class='line' id='LC237'><span class="cm">	 * @see SingleColumnRowMapper</span></div><div class='line' id='LC238'><span class="cm">	 */</span></div><div class='line' id='LC239'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">queryForList</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">elementType</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC240'><br/></div><div class='line' id='LC241'>	<span class="cm">/**</span></div><div class='line' id='LC242'><span class="cm">	 * Execute a query for a result list, given static SQL.</span></div><div class='line' id='LC243'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC244'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC245'><span class="cm">	 * {@code queryForList} method with {@code null} as argument array.</span></div><div class='line' id='LC246'><span class="cm">	 * &lt;p&gt;The results will be mapped to a List (one entry for each row) of</span></div><div class='line' id='LC247'><span class="cm">	 * Maps (one entry for each column using the column name as the key).</span></div><div class='line' id='LC248'><span class="cm">	 * Each element in the list will be of the form returned by this interface&#39;s</span></div><div class='line' id='LC249'><span class="cm">	 * queryForMap() methods.</span></div><div class='line' id='LC250'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC251'><span class="cm">	 * @return an List that contains a Map per row</span></div><div class='line' id='LC252'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC253'><span class="cm">	 * @see #queryForList(String, Object[])</span></div><div class='line' id='LC254'><span class="cm">	 */</span></div><div class='line' id='LC255'>	<span class="n">List</span><span class="o">&lt;</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;&gt;</span> <span class="n">queryForList</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC256'><br/></div><div class='line' id='LC257'>	<span class="cm">/**</span></div><div class='line' id='LC258'><span class="cm">	 * Execute a query for a SqlRowSet, given static SQL.</span></div><div class='line' id='LC259'><span class="cm">	 * &lt;p&gt;Uses a JDBC Statement, not a PreparedStatement. If you want to</span></div><div class='line' id='LC260'><span class="cm">	 * execute a static query with a PreparedStatement, use the overloaded</span></div><div class='line' id='LC261'><span class="cm">	 * {@code queryForRowSet} method with {@code null} as argument array.</span></div><div class='line' id='LC262'><span class="cm">	 * &lt;p&gt;The results will be mapped to an SqlRowSet which holds the data in a</span></div><div class='line' id='LC263'><span class="cm">	 * disconnected fashion. This wrapper will translate any SQLExceptions thrown.</span></div><div class='line' id='LC264'><span class="cm">	 * &lt;p&gt;Note that that, for the default implementation, JDBC RowSet support needs to</span></div><div class='line' id='LC265'><span class="cm">	 * be available at runtime: by default, Sun&#39;s {@code com.sun.rowset.CachedRowSetImpl}</span></div><div class='line' id='LC266'><span class="cm">	 * class is used, which is part of JDK 1.5+ and also available separately as part of</span></div><div class='line' id='LC267'><span class="cm">	 * Sun&#39;s JDBC RowSet Implementations download (rowset.jar).</span></div><div class='line' id='LC268'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC269'><span class="cm">	 * @return a SqlRowSet representation (possibly a wrapper around a</span></div><div class='line' id='LC270'><span class="cm">	 * {@code javax.sql.rowset.CachedRowSet})</span></div><div class='line' id='LC271'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC272'><span class="cm">	 * @see #queryForRowSet(String, Object[])</span></div><div class='line' id='LC273'><span class="cm">	 * @see SqlRowSetResultSetExtractor</span></div><div class='line' id='LC274'><span class="cm">	 * @see javax.sql.rowset.CachedRowSet</span></div><div class='line' id='LC275'><span class="cm">	 */</span></div><div class='line' id='LC276'>	<span class="n">SqlRowSet</span> <span class="nf">queryForRowSet</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC277'><br/></div><div class='line' id='LC278'>	<span class="cm">/**</span></div><div class='line' id='LC279'><span class="cm">	 * Issue a single SQL update operation (such as an insert, update or delete statement).</span></div><div class='line' id='LC280'><span class="cm">	 * @param sql static SQL to execute</span></div><div class='line' id='LC281'><span class="cm">	 * @return the number of rows affected</span></div><div class='line' id='LC282'><span class="cm">	 * @throws DataAccessException if there is any problem.</span></div><div class='line' id='LC283'><span class="cm">	 */</span></div><div class='line' id='LC284'>	<span class="kt">int</span> <span class="nf">update</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC285'><br/></div><div class='line' id='LC286'>	<span class="cm">/**</span></div><div class='line' id='LC287'><span class="cm">	 * Issue multiple SQL updates on a single JDBC Statement using batching.</span></div><div class='line' id='LC288'><span class="cm">	 * &lt;p&gt;Will fall back to separate updates on a single Statement if the JDBC</span></div><div class='line' id='LC289'><span class="cm">	 * driver does not support batch updates.</span></div><div class='line' id='LC290'><span class="cm">	 * @param sql defining an array of SQL statements that will be executed.</span></div><div class='line' id='LC291'><span class="cm">	 * @return an array of the number of rows affected by each statement</span></div><div class='line' id='LC292'><span class="cm">	 * @throws DataAccessException if there is any problem executing the batch</span></div><div class='line' id='LC293'><span class="cm">	 */</span></div><div class='line' id='LC294'>	<span class="kt">int</span><span class="o">[]</span> <span class="nf">batchUpdate</span><span class="o">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">sql</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC295'><br/></div><div class='line' id='LC296'><br/></div><div class='line' id='LC297'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC298'>	<span class="c1">// Methods dealing with prepared statements</span></div><div class='line' id='LC299'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC300'><br/></div><div class='line' id='LC301'>	<span class="cm">/**</span></div><div class='line' id='LC302'><span class="cm">	 * Execute a JDBC data access operation, implemented as callback action</span></div><div class='line' id='LC303'><span class="cm">	 * working on a JDBC PreparedStatement. This allows for implementing arbitrary</span></div><div class='line' id='LC304'><span class="cm">	 * data access operations on a single Statement, within Spring&#39;s managed</span></div><div class='line' id='LC305'><span class="cm">	 * JDBC environment: that is, participating in Spring-managed transactions</span></div><div class='line' id='LC306'><span class="cm">	 * and converting JDBC SQLExceptions into Spring&#39;s DataAccessException hierarchy.</span></div><div class='line' id='LC307'><span class="cm">	 * &lt;p&gt;The callback action can return a result object, for example a</span></div><div class='line' id='LC308'><span class="cm">	 * domain object or a collection of domain objects.</span></div><div class='line' id='LC309'><span class="cm">	 * @param psc object that can create a PreparedStatement given a Connection</span></div><div class='line' id='LC310'><span class="cm">	 * @param action callback object that specifies the action</span></div><div class='line' id='LC311'><span class="cm">	 * @return a result object returned by the action, or {@code null}</span></div><div class='line' id='LC312'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC313'><span class="cm">	 */</span></div><div class='line' id='LC314'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">execute</span><span class="o">(</span><span class="n">PreparedStatementCreator</span> <span class="n">psc</span><span class="o">,</span> <span class="n">PreparedStatementCallback</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">action</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC315'><br/></div><div class='line' id='LC316'>	<span class="cm">/**</span></div><div class='line' id='LC317'><span class="cm">	 * Execute a JDBC data access operation, implemented as callback action</span></div><div class='line' id='LC318'><span class="cm">	 * working on a JDBC PreparedStatement. This allows for implementing arbitrary</span></div><div class='line' id='LC319'><span class="cm">	 * data access operations on a single Statement, within Spring&#39;s managed</span></div><div class='line' id='LC320'><span class="cm">	 * JDBC environment: that is, participating in Spring-managed transactions</span></div><div class='line' id='LC321'><span class="cm">	 * and converting JDBC SQLExceptions into Spring&#39;s DataAccessException hierarchy.</span></div><div class='line' id='LC322'><span class="cm">	 * &lt;p&gt;The callback action can return a result object, for example a</span></div><div class='line' id='LC323'><span class="cm">	 * domain object or a collection of domain objects.</span></div><div class='line' id='LC324'><span class="cm">	 * @param sql SQL to execute</span></div><div class='line' id='LC325'><span class="cm">	 * @param action callback object that specifies the action</span></div><div class='line' id='LC326'><span class="cm">	 * @return a result object returned by the action, or {@code null}</span></div><div class='line' id='LC327'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC328'><span class="cm">	 */</span></div><div class='line' id='LC329'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">execute</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">PreparedStatementCallback</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">action</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC330'><br/></div><div class='line' id='LC331'>	<span class="cm">/**</span></div><div class='line' id='LC332'><span class="cm">	 * Query using a prepared statement, reading the ResultSet with a</span></div><div class='line' id='LC333'><span class="cm">	 * ResultSetExtractor.</span></div><div class='line' id='LC334'><span class="cm">	 * &lt;p&gt;A PreparedStatementCreator can either be implemented directly or</span></div><div class='line' id='LC335'><span class="cm">	 * configured through a PreparedStatementCreatorFactory.</span></div><div class='line' id='LC336'><span class="cm">	 * @param psc object that can create a PreparedStatement given a Connection</span></div><div class='line' id='LC337'><span class="cm">	 * @param rse object that will extract results</span></div><div class='line' id='LC338'><span class="cm">	 * @return an arbitrary result object, as returned by the ResultSetExtractor</span></div><div class='line' id='LC339'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC340'><span class="cm">	 * @see PreparedStatementCreatorFactory</span></div><div class='line' id='LC341'><span class="cm">	 */</span></div><div class='line' id='LC342'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">query</span><span class="o">(</span><span class="n">PreparedStatementCreator</span> <span class="n">psc</span><span class="o">,</span> <span class="n">ResultSetExtractor</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rse</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC343'><br/></div><div class='line' id='LC344'>	<span class="cm">/**</span></div><div class='line' id='LC345'><span class="cm">	 * Query using a prepared statement, reading the ResultSet with a</span></div><div class='line' id='LC346'><span class="cm">	 * ResultSetExtractor.</span></div><div class='line' id='LC347'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC348'><span class="cm">	 * @param pss object that knows how to set values on the prepared statement.</span></div><div class='line' id='LC349'><span class="cm">	 * If this is {@code null}, the SQL will be assumed to contain no bind parameters.</span></div><div class='line' id='LC350'><span class="cm">	 * Even if there are no bind parameters, this object may be used to</span></div><div class='line' id='LC351'><span class="cm">	 * set fetch size and other performance options.</span></div><div class='line' id='LC352'><span class="cm">	 * @param rse object that will extract results</span></div><div class='line' id='LC353'><span class="cm">	 * @return an arbitrary result object, as returned by the ResultSetExtractor</span></div><div class='line' id='LC354'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC355'><span class="cm">	 */</span></div><div class='line' id='LC356'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">PreparedStatementSetter</span> <span class="n">pss</span><span class="o">,</span> <span class="n">ResultSetExtractor</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rse</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC357'><br/></div><div class='line' id='LC358'>	<span class="cm">/**</span></div><div class='line' id='LC359'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC360'><span class="cm">	 * of arguments to bind to the query, reading the ResultSet with a</span></div><div class='line' id='LC361'><span class="cm">	 * ResultSetExtractor.</span></div><div class='line' id='LC362'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC363'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC364'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC365'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC366'><span class="cm">	 * @param rse object that will extract results</span></div><div class='line' id='LC367'><span class="cm">	 * @return an arbitrary result object, as returned by the ResultSetExtractor</span></div><div class='line' id='LC368'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC369'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC370'><span class="cm">	 */</span></div><div class='line' id='LC371'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">,</span> <span class="n">ResultSetExtractor</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rse</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC372'><br/></div><div class='line' id='LC373'>	<span class="cm">/**</span></div><div class='line' id='LC374'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC375'><span class="cm">	 * of arguments to bind to the query, reading the ResultSet with a</span></div><div class='line' id='LC376'><span class="cm">	 * ResultSetExtractor.</span></div><div class='line' id='LC377'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC378'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC379'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC380'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC381'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC382'><span class="cm">	 * @param rse object that will extract results</span></div><div class='line' id='LC383'><span class="cm">	 * @return an arbitrary result object, as returned by the ResultSetExtractor</span></div><div class='line' id='LC384'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC385'><span class="cm">	 */</span></div><div class='line' id='LC386'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">ResultSetExtractor</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rse</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC387'><br/></div><div class='line' id='LC388'>	<span class="cm">/**</span></div><div class='line' id='LC389'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC390'><span class="cm">	 * of arguments to bind to the query, reading the ResultSet with a</span></div><div class='line' id='LC391'><span class="cm">	 * ResultSetExtractor.</span></div><div class='line' id='LC392'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC393'><span class="cm">	 * @param rse object that will extract results</span></div><div class='line' id='LC394'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC395'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC396'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC397'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC398'><span class="cm">	 * @return an arbitrary result object, as returned by the ResultSetExtractor</span></div><div class='line' id='LC399'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC400'><span class="cm">	 */</span></div><div class='line' id='LC401'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">ResultSetExtractor</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rse</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC402'><br/></div><div class='line' id='LC403'>	<span class="cm">/**</span></div><div class='line' id='LC404'><span class="cm">	 * Query using a prepared statement, reading the ResultSet on a per-row</span></div><div class='line' id='LC405'><span class="cm">	 * basis with a RowCallbackHandler.</span></div><div class='line' id='LC406'><span class="cm">	 * &lt;p&gt;A PreparedStatementCreator can either be implemented directly or</span></div><div class='line' id='LC407'><span class="cm">	 * configured through a PreparedStatementCreatorFactory.</span></div><div class='line' id='LC408'><span class="cm">	 * @param psc object that can create a PreparedStatement given a Connection</span></div><div class='line' id='LC409'><span class="cm">	 * @param rch object that will extract results, one row at a time</span></div><div class='line' id='LC410'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC411'><span class="cm">	 * @see PreparedStatementCreatorFactory</span></div><div class='line' id='LC412'><span class="cm">	 */</span></div><div class='line' id='LC413'>	<span class="kt">void</span> <span class="nf">query</span><span class="o">(</span><span class="n">PreparedStatementCreator</span> <span class="n">psc</span><span class="o">,</span> <span class="n">RowCallbackHandler</span> <span class="n">rch</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC414'><br/></div><div class='line' id='LC415'>	<span class="cm">/**</span></div><div class='line' id='LC416'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC417'><span class="cm">	 * PreparedStatementSetter implementation that knows how to bind values</span></div><div class='line' id='LC418'><span class="cm">	 * to the query, reading the ResultSet on a per-row basis with a</span></div><div class='line' id='LC419'><span class="cm">	 * RowCallbackHandler.</span></div><div class='line' id='LC420'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC421'><span class="cm">	 * @param pss object that knows how to set values on the prepared statement.</span></div><div class='line' id='LC422'><span class="cm">	 * If this is {@code null}, the SQL will be assumed to contain no bind parameters.</span></div><div class='line' id='LC423'><span class="cm">	 * Even if there are no bind parameters, this object may be used to</span></div><div class='line' id='LC424'><span class="cm">	 * set fetch size and other performance options.</span></div><div class='line' id='LC425'><span class="cm">	 * @param rch object that will extract results, one row at a time</span></div><div class='line' id='LC426'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC427'><span class="cm">	 */</span></div><div class='line' id='LC428'>	<span class="kt">void</span> <span class="nf">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">PreparedStatementSetter</span> <span class="n">pss</span><span class="o">,</span> <span class="n">RowCallbackHandler</span> <span class="n">rch</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC429'><br/></div><div class='line' id='LC430'>	<span class="cm">/**</span></div><div class='line' id='LC431'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list of</span></div><div class='line' id='LC432'><span class="cm">	 * arguments to bind to the query, reading the ResultSet on a per-row basis</span></div><div class='line' id='LC433'><span class="cm">	 * with a RowCallbackHandler.</span></div><div class='line' id='LC434'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC435'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC436'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC437'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC438'><span class="cm">	 * @param rch object that will extract results, one row at a time</span></div><div class='line' id='LC439'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC440'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC441'><span class="cm">	 */</span></div><div class='line' id='LC442'>	<span class="kt">void</span> <span class="nf">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">,</span> <span class="n">RowCallbackHandler</span> <span class="n">rch</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC443'><br/></div><div class='line' id='LC444'>	<span class="cm">/**</span></div><div class='line' id='LC445'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list of</span></div><div class='line' id='LC446'><span class="cm">	 * arguments to bind to the query, reading the ResultSet on a per-row basis</span></div><div class='line' id='LC447'><span class="cm">	 * with a RowCallbackHandler.</span></div><div class='line' id='LC448'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC449'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC450'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC451'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC452'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC453'><span class="cm">	 * @param rch object that will extract results, one row at a time</span></div><div class='line' id='LC454'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC455'><span class="cm">	 */</span></div><div class='line' id='LC456'>	<span class="kt">void</span> <span class="nf">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">RowCallbackHandler</span> <span class="n">rch</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC457'><br/></div><div class='line' id='LC458'>	<span class="cm">/**</span></div><div class='line' id='LC459'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list of</span></div><div class='line' id='LC460'><span class="cm">	 * arguments to bind to the query, reading the ResultSet on a per-row basis</span></div><div class='line' id='LC461'><span class="cm">	 * with a RowCallbackHandler.</span></div><div class='line' id='LC462'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC463'><span class="cm">	 * @param rch object that will extract results, one row at a time</span></div><div class='line' id='LC464'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC465'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC466'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC467'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC468'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC469'><span class="cm">	 */</span></div><div class='line' id='LC470'>	<span class="kt">void</span> <span class="nf">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">RowCallbackHandler</span> <span class="n">rch</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC471'><br/></div><div class='line' id='LC472'>	<span class="cm">/**</span></div><div class='line' id='LC473'><span class="cm">	 * Query using a prepared statement, mapping each row to a Java object</span></div><div class='line' id='LC474'><span class="cm">	 * via a RowMapper.</span></div><div class='line' id='LC475'><span class="cm">	 * &lt;p&gt;A PreparedStatementCreator can either be implemented directly or</span></div><div class='line' id='LC476'><span class="cm">	 * configured through a PreparedStatementCreatorFactory.</span></div><div class='line' id='LC477'><span class="cm">	 * @param psc object that can create a PreparedStatement given a Connection</span></div><div class='line' id='LC478'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC479'><span class="cm">	 * @return the result List, containing mapped objects</span></div><div class='line' id='LC480'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC481'><span class="cm">	 * @see PreparedStatementCreatorFactory</span></div><div class='line' id='LC482'><span class="cm">	 */</span></div><div class='line' id='LC483'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">query</span><span class="o">(</span><span class="n">PreparedStatementCreator</span> <span class="n">psc</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC484'><br/></div><div class='line' id='LC485'>	<span class="cm">/**</span></div><div class='line' id='LC486'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC487'><span class="cm">	 * PreparedStatementSetter implementation that knows how to bind values</span></div><div class='line' id='LC488'><span class="cm">	 * to the query, mapping each row to a Java object via a RowMapper.</span></div><div class='line' id='LC489'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC490'><span class="cm">	 * @param pss object that knows how to set values on the prepared statement.</span></div><div class='line' id='LC491'><span class="cm">	 * If this is {@code null}, the SQL will be assumed to contain no bind parameters.</span></div><div class='line' id='LC492'><span class="cm">	 * Even if there are no bind parameters, this object may be used to</span></div><div class='line' id='LC493'><span class="cm">	 * set fetch size and other performance options.</span></div><div class='line' id='LC494'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC495'><span class="cm">	 * @return the result List, containing mapped objects</span></div><div class='line' id='LC496'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC497'><span class="cm">	 */</span></div><div class='line' id='LC498'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">PreparedStatementSetter</span> <span class="n">pss</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC499'><br/></div><div class='line' id='LC500'>	<span class="cm">/**</span></div><div class='line' id='LC501'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC502'><span class="cm">	 * of arguments to bind to the query, mapping each row to a Java object</span></div><div class='line' id='LC503'><span class="cm">	 * via a RowMapper.</span></div><div class='line' id='LC504'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC505'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC506'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC507'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC508'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC509'><span class="cm">	 * @return the result List, containing mapped objects</span></div><div class='line' id='LC510'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC511'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC512'><span class="cm">	 */</span></div><div class='line' id='LC513'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC514'><br/></div><div class='line' id='LC515'>	<span class="cm">/**</span></div><div class='line' id='LC516'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC517'><span class="cm">	 * of arguments to bind to the query, mapping each row to a Java object</span></div><div class='line' id='LC518'><span class="cm">	 * via a RowMapper.</span></div><div class='line' id='LC519'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC520'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC521'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC522'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC523'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC524'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC525'><span class="cm">	 * @return the result List, containing mapped objects</span></div><div class='line' id='LC526'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC527'><span class="cm">	 */</span></div><div class='line' id='LC528'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC529'><br/></div><div class='line' id='LC530'>	<span class="cm">/**</span></div><div class='line' id='LC531'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC532'><span class="cm">	 * of arguments to bind to the query, mapping each row to a Java object</span></div><div class='line' id='LC533'><span class="cm">	 * via a RowMapper.</span></div><div class='line' id='LC534'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC535'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC536'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC537'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC538'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC539'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC540'><span class="cm">	 * @return the result List, containing mapped objects</span></div><div class='line' id='LC541'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC542'><span class="cm">	 */</span></div><div class='line' id='LC543'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">query</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC544'><br/></div><div class='line' id='LC545'>	<span class="cm">/**</span></div><div class='line' id='LC546'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC547'><span class="cm">	 * of arguments to bind to the query, mapping a single result row to a</span></div><div class='line' id='LC548'><span class="cm">	 * Java object via a RowMapper.</span></div><div class='line' id='LC549'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC550'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC551'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type)</span></div><div class='line' id='LC552'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC553'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC554'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC555'><span class="cm">	 * @return the single mapped object</span></div><div class='line' id='LC556'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not</span></div><div class='line' id='LC557'><span class="cm">	 * return exactly one row</span></div><div class='line' id='LC558'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC559'><span class="cm">	 */</span></div><div class='line' id='LC560'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span></div><div class='line' id='LC561'>			<span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC562'><br/></div><div class='line' id='LC563'>	<span class="cm">/**</span></div><div class='line' id='LC564'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC565'><span class="cm">	 * of arguments to bind to the query, mapping a single result row to a</span></div><div class='line' id='LC566'><span class="cm">	 * Java object via a RowMapper.</span></div><div class='line' id='LC567'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC568'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC569'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC570'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC571'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC572'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC573'><span class="cm">	 * @return the single mapped object</span></div><div class='line' id='LC574'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not</span></div><div class='line' id='LC575'><span class="cm">	 * return exactly one row</span></div><div class='line' id='LC576'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC577'><span class="cm">	 */</span></div><div class='line' id='LC578'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC579'><br/></div><div class='line' id='LC580'>	<span class="cm">/**</span></div><div class='line' id='LC581'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a list</span></div><div class='line' id='LC582'><span class="cm">	 * of arguments to bind to the query, mapping a single result row to a</span></div><div class='line' id='LC583'><span class="cm">	 * Java object via a RowMapper.</span></div><div class='line' id='LC584'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC585'><span class="cm">	 * @param rowMapper object that will map one object per row</span></div><div class='line' id='LC586'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC587'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC588'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC589'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC590'><span class="cm">	 * @return the single mapped object</span></div><div class='line' id='LC591'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not</span></div><div class='line' id='LC592'><span class="cm">	 * return exactly one row</span></div><div class='line' id='LC593'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC594'><span class="cm">	 */</span></div><div class='line' id='LC595'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">rowMapper</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC596'><br/></div><div class='line' id='LC597'>	<span class="cm">/**</span></div><div class='line' id='LC598'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC599'><span class="cm">	 * list of arguments to bind to the query, expecting a result object.</span></div><div class='line' id='LC600'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row/single column query; the returned</span></div><div class='line' id='LC601'><span class="cm">	 * result will be directly mapped to the corresponding object type.</span></div><div class='line' id='LC602'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC603'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC604'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC605'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC606'><span class="cm">	 * @param requiredType the type that the result object is expected to match</span></div><div class='line' id='LC607'><span class="cm">	 * @return the result object of the required type, or {@code null} in case of SQL NULL</span></div><div class='line' id='LC608'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC609'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC610'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC611'><span class="cm">	 * @see #queryForObject(String, Class)</span></div><div class='line' id='LC612'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC613'><span class="cm">	 */</span></div><div class='line' id='LC614'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">requiredType</span><span class="o">)</span></div><div class='line' id='LC615'>			<span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC616'><br/></div><div class='line' id='LC617'>	<span class="cm">/**</span></div><div class='line' id='LC618'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC619'><span class="cm">	 * list of arguments to bind to the query, expecting a result object.</span></div><div class='line' id='LC620'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row/single column query; the returned</span></div><div class='line' id='LC621'><span class="cm">	 * result will be directly mapped to the corresponding object type.</span></div><div class='line' id='LC622'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC623'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC624'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC625'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC626'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC627'><span class="cm">	 * @param requiredType the type that the result object is expected to match</span></div><div class='line' id='LC628'><span class="cm">	 * @return the result object of the required type, or {@code null} in case of SQL NULL</span></div><div class='line' id='LC629'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC630'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC631'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC632'><span class="cm">	 * @see #queryForObject(String, Class)</span></div><div class='line' id='LC633'><span class="cm">	 */</span></div><div class='line' id='LC634'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">requiredType</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC635'><br/></div><div class='line' id='LC636'>	<span class="cm">/**</span></div><div class='line' id='LC637'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC638'><span class="cm">	 * list of arguments to bind to the query, expecting a result object.</span></div><div class='line' id='LC639'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row/single column query; the returned</span></div><div class='line' id='LC640'><span class="cm">	 * result will be directly mapped to the corresponding object type.</span></div><div class='line' id='LC641'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC642'><span class="cm">	 * @param requiredType the type that the result object is expected to match</span></div><div class='line' id='LC643'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC644'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC645'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC646'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC647'><span class="cm">	 * @return the result object of the required type, or {@code null} in case of SQL NULL</span></div><div class='line' id='LC648'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC649'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC650'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC651'><span class="cm">	 * @see #queryForObject(String, Class)</span></div><div class='line' id='LC652'><span class="cm">	 */</span></div><div class='line' id='LC653'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">queryForObject</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">requiredType</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC654'><br/></div><div class='line' id='LC655'>	<span class="cm">/**</span></div><div class='line' id='LC656'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC657'><span class="cm">	 * list of arguments to bind to the query, expecting a result Map.</span></div><div class='line' id='LC658'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row query; the result row will be</span></div><div class='line' id='LC659'><span class="cm">	 * mapped to a Map (one entry for each column, using the column name as the key).</span></div><div class='line' id='LC660'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC661'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC662'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC663'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC664'><span class="cm">	 * @return the result Map (one entry for each column, using the</span></div><div class='line' id='LC665'><span class="cm">	 * column name as the key)</span></div><div class='line' id='LC666'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not</span></div><div class='line' id='LC667'><span class="cm">	 * return exactly one row</span></div><div class='line' id='LC668'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC669'><span class="cm">	 * @see #queryForMap(String)</span></div><div class='line' id='LC670'><span class="cm">	 * @see ColumnMapRowMapper</span></div><div class='line' id='LC671'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC672'><span class="cm">	 */</span></div><div class='line' id='LC673'>	<span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">queryForMap</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC674'><br/></div><div class='line' id='LC675'>	<span class="cm">/**</span></div><div class='line' id='LC676'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC677'><span class="cm">	 * list of arguments to bind to the query, expecting a result Map.</span></div><div class='line' id='LC678'><span class="cm">	 * The queryForMap() methods defined by this interface are appropriate</span></div><div class='line' id='LC679'><span class="cm">	 * when you don&#39;t have a domain model. Otherwise, consider using</span></div><div class='line' id='LC680'><span class="cm">	 * one of the queryForObject() methods.</span></div><div class='line' id='LC681'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row query; the result row will be</span></div><div class='line' id='LC682'><span class="cm">	 * mapped to a Map (one entry for each column, using the column name as the key).</span></div><div class='line' id='LC683'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC684'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC685'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC686'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC687'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC688'><span class="cm">	 * @return the result Map (one entry for each column, using the</span></div><div class='line' id='LC689'><span class="cm">	 * column name as the key)</span></div><div class='line' id='LC690'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not</span></div><div class='line' id='LC691'><span class="cm">	 * return exactly one row</span></div><div class='line' id='LC692'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC693'><span class="cm">	 * @see #queryForMap(String)</span></div><div class='line' id='LC694'><span class="cm">	 * @see ColumnMapRowMapper</span></div><div class='line' id='LC695'><span class="cm">	 */</span></div><div class='line' id='LC696'>	<span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">queryForMap</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC697'><br/></div><div class='line' id='LC698'>	<span class="cm">/**</span></div><div class='line' id='LC699'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC700'><span class="cm">	 * list of arguments to bind to the query, resulting in a long value.</span></div><div class='line' id='LC701'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row/single column query that</span></div><div class='line' id='LC702'><span class="cm">	 * results in a long value.</span></div><div class='line' id='LC703'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC704'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC705'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC706'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC707'><span class="cm">	 * @return the long value, or 0 in case of SQL NULL</span></div><div class='line' id='LC708'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC709'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC710'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC711'><span class="cm">	 * @see #queryForLong(String)</span></div><div class='line' id='LC712'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC713'><span class="cm">	 * @deprecated in favor of {@link #queryForObject(String, Object[], int[], Class)} )}</span></div><div class='line' id='LC714'><span class="cm">	 */</span></div><div class='line' id='LC715'>	<span class="nd">@Deprecated</span></div><div class='line' id='LC716'>	<span class="kt">long</span> <span class="nf">queryForLong</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC717'><br/></div><div class='line' id='LC718'>	<span class="cm">/**</span></div><div class='line' id='LC719'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC720'><span class="cm">	 * list of arguments to bind to the query, resulting in a long value.</span></div><div class='line' id='LC721'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row/single column query that</span></div><div class='line' id='LC722'><span class="cm">	 * results in a long value.</span></div><div class='line' id='LC723'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC724'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC725'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC726'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC727'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC728'><span class="cm">	 * @return the long value, or 0 in case of SQL NULL</span></div><div class='line' id='LC729'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC730'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC731'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC732'><span class="cm">	 * @see #queryForLong(String)</span></div><div class='line' id='LC733'><span class="cm">	 * @deprecated in favor of {@link #queryForObject(String, Class, Object[])} )}</span></div><div class='line' id='LC734'><span class="cm">	 */</span></div><div class='line' id='LC735'>	<span class="nd">@Deprecated</span></div><div class='line' id='LC736'>	<span class="kt">long</span> <span class="nf">queryForLong</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC737'><br/></div><div class='line' id='LC738'>	<span class="cm">/**</span></div><div class='line' id='LC739'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC740'><span class="cm">	 * list of arguments to bind to the query, resulting in an int value.</span></div><div class='line' id='LC741'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row/single column query that</span></div><div class='line' id='LC742'><span class="cm">	 * results in an int value.</span></div><div class='line' id='LC743'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC744'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC745'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC746'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC747'><span class="cm">	 * @return the int value, or 0 in case of SQL NULL</span></div><div class='line' id='LC748'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC749'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC750'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC751'><span class="cm">	 * @see #queryForInt(String)</span></div><div class='line' id='LC752'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC753'><span class="cm">	 * @deprecated in favor of {@link #queryForObject(String, Object[], int[], Class)} )}</span></div><div class='line' id='LC754'><span class="cm">	 */</span></div><div class='line' id='LC755'>	<span class="nd">@Deprecated</span></div><div class='line' id='LC756'>	<span class="kt">int</span> <span class="nf">queryForInt</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC757'><br/></div><div class='line' id='LC758'>	<span class="cm">/**</span></div><div class='line' id='LC759'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC760'><span class="cm">	 * list of arguments to bind to the query, resulting in an int value.</span></div><div class='line' id='LC761'><span class="cm">	 * &lt;p&gt;The query is expected to be a single row/single column query that</span></div><div class='line' id='LC762'><span class="cm">	 * results in an int value.</span></div><div class='line' id='LC763'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC764'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC765'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC766'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC767'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC768'><span class="cm">	 * @return the int value, or 0 in case of SQL NULL</span></div><div class='line' id='LC769'><span class="cm">	 * @throws IncorrectResultSizeDataAccessException if the query does not return</span></div><div class='line' id='LC770'><span class="cm">	 * exactly one row, or does not return exactly one column in that row</span></div><div class='line' id='LC771'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC772'><span class="cm">	 * @see #queryForInt(String)</span></div><div class='line' id='LC773'><span class="cm">	 * @deprecated in favor of {@link #queryForObject(String, Class, Object[])} )}</span></div><div class='line' id='LC774'><span class="cm">	 */</span></div><div class='line' id='LC775'>	<span class="nd">@Deprecated</span></div><div class='line' id='LC776'>	<span class="kt">int</span> <span class="nf">queryForInt</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC777'><br/></div><div class='line' id='LC778'>	<span class="cm">/**</span></div><div class='line' id='LC779'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC780'><span class="cm">	 * list of arguments to bind to the query, expecting a result list.</span></div><div class='line' id='LC781'><span class="cm">	 * &lt;p&gt;The results will be mapped to a List (one entry for each row) of</span></div><div class='line' id='LC782'><span class="cm">	 * result objects, each of them matching the specified element type.</span></div><div class='line' id='LC783'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC784'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC785'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC786'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC787'><span class="cm">	 * @param elementType the required type of element in the result list</span></div><div class='line' id='LC788'><span class="cm">	 * (for example, {@code Integer.class})</span></div><div class='line' id='LC789'><span class="cm">	 * @return a List of objects that match the specified element type</span></div><div class='line' id='LC790'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC791'><span class="cm">	 * @see #queryForList(String, Class)</span></div><div class='line' id='LC792'><span class="cm">	 * @see SingleColumnRowMapper</span></div><div class='line' id='LC793'><span class="cm">	 */</span></div><div class='line' id='LC794'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span><span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">queryForList</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">elementType</span><span class="o">)</span></div><div class='line' id='LC795'>			<span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC796'><br/></div><div class='line' id='LC797'>	<span class="cm">/**</span></div><div class='line' id='LC798'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC799'><span class="cm">	 * list of arguments to bind to the query, expecting a result list.</span></div><div class='line' id='LC800'><span class="cm">	 * &lt;p&gt;The results will be mapped to a List (one entry for each row) of</span></div><div class='line' id='LC801'><span class="cm">	 * result objects, each of them matching the specified element type.</span></div><div class='line' id='LC802'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC803'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC804'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC805'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC806'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC807'><span class="cm">	 * @param elementType the required type of element in the result list</span></div><div class='line' id='LC808'><span class="cm">	 * (for example, {@code Integer.class})</span></div><div class='line' id='LC809'><span class="cm">	 * @return a List of objects that match the specified element type</span></div><div class='line' id='LC810'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC811'><span class="cm">	 * @see #queryForList(String, Class)</span></div><div class='line' id='LC812'><span class="cm">	 * @see SingleColumnRowMapper</span></div><div class='line' id='LC813'><span class="cm">	 */</span></div><div class='line' id='LC814'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">queryForList</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">elementType</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC815'><br/></div><div class='line' id='LC816'>	<span class="cm">/**</span></div><div class='line' id='LC817'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC818'><span class="cm">	 * list of arguments to bind to the query, expecting a result list.</span></div><div class='line' id='LC819'><span class="cm">	 * &lt;p&gt;The results will be mapped to a List (one entry for each row) of</span></div><div class='line' id='LC820'><span class="cm">	 * result objects, each of them matching the specified element type.</span></div><div class='line' id='LC821'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC822'><span class="cm">	 * @param elementType the required type of element in the result list</span></div><div class='line' id='LC823'><span class="cm">	 * (for example, {@code Integer.class})</span></div><div class='line' id='LC824'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC825'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC826'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC827'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC828'><span class="cm">	 * @return a List of objects that match the specified element type</span></div><div class='line' id='LC829'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC830'><span class="cm">	 * @see #queryForList(String, Class)</span></div><div class='line' id='LC831'><span class="cm">	 * @see SingleColumnRowMapper</span></div><div class='line' id='LC832'><span class="cm">	 */</span></div><div class='line' id='LC833'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">queryForList</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">elementType</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC834'><br/></div><div class='line' id='LC835'>	<span class="cm">/**</span></div><div class='line' id='LC836'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC837'><span class="cm">	 * list of arguments to bind to the query, expecting a result list.</span></div><div class='line' id='LC838'><span class="cm">	 * &lt;p&gt;The results will be mapped to a List (one entry for each row) of</span></div><div class='line' id='LC839'><span class="cm">	 * Maps (one entry for each column, using the column name as the key).</span></div><div class='line' id='LC840'><span class="cm">	 * Thus  Each element in the list will be of the form returned by this interface&#39;s</span></div><div class='line' id='LC841'><span class="cm">	 * queryForMap() methods.</span></div><div class='line' id='LC842'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC843'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC844'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC845'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC846'><span class="cm">	 * @return a List that contains a Map per row</span></div><div class='line' id='LC847'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC848'><span class="cm">	 * @see #queryForList(String)</span></div><div class='line' id='LC849'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC850'><span class="cm">	 */</span></div><div class='line' id='LC851'>	<span class="n">List</span><span class="o">&lt;</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;&gt;</span> <span class="n">queryForList</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC852'><br/></div><div class='line' id='LC853'>	<span class="cm">/**</span></div><div class='line' id='LC854'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC855'><span class="cm">	 * list of arguments to bind to the query, expecting a result list.</span></div><div class='line' id='LC856'><span class="cm">	 * &lt;p&gt;The results will be mapped to a List (one entry for each row) of</span></div><div class='line' id='LC857'><span class="cm">	 * Maps (one entry for each column, using the column name as the key).</span></div><div class='line' id='LC858'><span class="cm">	 * Each element in the list will be of the form returned by this interface&#39;s</span></div><div class='line' id='LC859'><span class="cm">	 * queryForMap() methods.</span></div><div class='line' id='LC860'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC861'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC862'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC863'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC864'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC865'><span class="cm">	 * @return a List that contains a Map per row</span></div><div class='line' id='LC866'><span class="cm">	 * @throws DataAccessException if the query fails</span></div><div class='line' id='LC867'><span class="cm">	 * @see #queryForList(String)</span></div><div class='line' id='LC868'><span class="cm">	 */</span></div><div class='line' id='LC869'>	<span class="n">List</span><span class="o">&lt;</span><span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;&gt;</span> <span class="n">queryForList</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC870'><br/></div><div class='line' id='LC871'>	<span class="cm">/**</span></div><div class='line' id='LC872'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC873'><span class="cm">	 * list of arguments to bind to the query, expecting a SqlRowSet.</span></div><div class='line' id='LC874'><span class="cm">	 * &lt;p&gt;The results will be mapped to an SqlRowSet which holds the data in a</span></div><div class='line' id='LC875'><span class="cm">	 * disconnected fashion. This wrapper will translate any SQLExceptions thrown.</span></div><div class='line' id='LC876'><span class="cm">	 * &lt;p&gt;Note that that, for the default implementation, JDBC RowSet support needs to</span></div><div class='line' id='LC877'><span class="cm">	 * be available at runtime: by default, Sun&#39;s {@code com.sun.rowset.CachedRowSetImpl}</span></div><div class='line' id='LC878'><span class="cm">	 * class is used, which is part of JDK 1.5+ and also available separately as part of</span></div><div class='line' id='LC879'><span class="cm">	 * Sun&#39;s JDBC RowSet Implementations download (rowset.jar).</span></div><div class='line' id='LC880'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC881'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC882'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC883'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC884'><span class="cm">	 * @return a SqlRowSet representation (possibly a wrapper around a</span></div><div class='line' id='LC885'><span class="cm">	 * {@code javax.sql.rowset.CachedRowSet})</span></div><div class='line' id='LC886'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC887'><span class="cm">	 * @see #queryForRowSet(String)</span></div><div class='line' id='LC888'><span class="cm">	 * @see SqlRowSetResultSetExtractor</span></div><div class='line' id='LC889'><span class="cm">	 * @see javax.sql.rowset.CachedRowSet</span></div><div class='line' id='LC890'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC891'><span class="cm">	 */</span></div><div class='line' id='LC892'>	<span class="n">SqlRowSet</span> <span class="nf">queryForRowSet</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC893'><br/></div><div class='line' id='LC894'>	<span class="cm">/**</span></div><div class='line' id='LC895'><span class="cm">	 * Query given SQL to create a prepared statement from SQL and a</span></div><div class='line' id='LC896'><span class="cm">	 * list of arguments to bind to the query, expecting a SqlRowSet.</span></div><div class='line' id='LC897'><span class="cm">	 * &lt;p&gt;The results will be mapped to an SqlRowSet which holds the data in a</span></div><div class='line' id='LC898'><span class="cm">	 * disconnected fashion. This wrapper will translate any SQLExceptions thrown.</span></div><div class='line' id='LC899'><span class="cm">	 * &lt;p&gt;Note that that, for the default implementation, JDBC RowSet support needs to</span></div><div class='line' id='LC900'><span class="cm">	 * be available at runtime: by default, Sun&#39;s {@code com.sun.rowset.CachedRowSetImpl}</span></div><div class='line' id='LC901'><span class="cm">	 * class is used, which is part of JDK 1.5+ and also available separately as part of</span></div><div class='line' id='LC902'><span class="cm">	 * Sun&#39;s JDBC RowSet Implementations download (rowset.jar).</span></div><div class='line' id='LC903'><span class="cm">	 * @param sql SQL query to execute</span></div><div class='line' id='LC904'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC905'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC906'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC907'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC908'><span class="cm">	 * @return a SqlRowSet representation (possibly a wrapper around a</span></div><div class='line' id='LC909'><span class="cm">	 * {@code javax.sql.rowset.CachedRowSet})</span></div><div class='line' id='LC910'><span class="cm">	 * @throws DataAccessException if there is any problem executing the query</span></div><div class='line' id='LC911'><span class="cm">	 * @see #queryForRowSet(String)</span></div><div class='line' id='LC912'><span class="cm">	 * @see SqlRowSetResultSetExtractor</span></div><div class='line' id='LC913'><span class="cm">	 * @see javax.sql.rowset.CachedRowSet</span></div><div class='line' id='LC914'><span class="cm">	 */</span></div><div class='line' id='LC915'>	<span class="n">SqlRowSet</span> <span class="nf">queryForRowSet</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC916'><br/></div><div class='line' id='LC917'>	<span class="cm">/**</span></div><div class='line' id='LC918'><span class="cm">	 * Issue a single SQL update operation (such as an insert, update or delete statement)</span></div><div class='line' id='LC919'><span class="cm">	 * using a PreparedStatementCreator to provide SQL and any required parameters.</span></div><div class='line' id='LC920'><span class="cm">	 * &lt;p&gt;A PreparedStatementCreator can either be implemented directly or</span></div><div class='line' id='LC921'><span class="cm">	 * configured through a PreparedStatementCreatorFactory.</span></div><div class='line' id='LC922'><span class="cm">	 * @param psc object that provides SQL and any necessary parameters</span></div><div class='line' id='LC923'><span class="cm">	 * @return the number of rows affected</span></div><div class='line' id='LC924'><span class="cm">	 * @throws DataAccessException if there is any problem issuing the update</span></div><div class='line' id='LC925'><span class="cm">	 * @see PreparedStatementCreatorFactory</span></div><div class='line' id='LC926'><span class="cm">	 */</span></div><div class='line' id='LC927'>	<span class="kt">int</span> <span class="nf">update</span><span class="o">(</span><span class="n">PreparedStatementCreator</span> <span class="n">psc</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC928'><br/></div><div class='line' id='LC929'>	<span class="cm">/**</span></div><div class='line' id='LC930'><span class="cm">	 * Issue an update statement using a PreparedStatementCreator to provide SQL and</span></div><div class='line' id='LC931'><span class="cm">	 * any required parameters. Generated keys will be put into the given KeyHolder.</span></div><div class='line' id='LC932'><span class="cm">	 * &lt;p&gt;Note that the given PreparedStatementCreator has to create a statement</span></div><div class='line' id='LC933'><span class="cm">	 * with activated extraction of generated keys (a JDBC 3.0 feature). This can</span></div><div class='line' id='LC934'><span class="cm">	 * either be done directly or through using a PreparedStatementCreatorFactory.</span></div><div class='line' id='LC935'><span class="cm">	 * @param psc object that provides SQL and any necessary parameters</span></div><div class='line' id='LC936'><span class="cm">	 * @param generatedKeyHolder KeyHolder that will hold the generated keys</span></div><div class='line' id='LC937'><span class="cm">	 * @return the number of rows affected</span></div><div class='line' id='LC938'><span class="cm">	 * @throws DataAccessException if there is any problem issuing the update</span></div><div class='line' id='LC939'><span class="cm">	 * @see PreparedStatementCreatorFactory</span></div><div class='line' id='LC940'><span class="cm">	 * @see org.springframework.jdbc.support.GeneratedKeyHolder</span></div><div class='line' id='LC941'><span class="cm">	 */</span></div><div class='line' id='LC942'>	<span class="kt">int</span> <span class="nf">update</span><span class="o">(</span><span class="n">PreparedStatementCreator</span> <span class="n">psc</span><span class="o">,</span> <span class="n">KeyHolder</span> <span class="n">generatedKeyHolder</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC943'><br/></div><div class='line' id='LC944'>	<span class="cm">/**</span></div><div class='line' id='LC945'><span class="cm">	 * Issue an update statement using a PreparedStatementSetter to set bind parameters,</span></div><div class='line' id='LC946'><span class="cm">	 * with given SQL. Simpler than using a PreparedStatementCreator as this method</span></div><div class='line' id='LC947'><span class="cm">	 * will create the PreparedStatement: The PreparedStatementSetter just needs to</span></div><div class='line' id='LC948'><span class="cm">	 * set parameters.</span></div><div class='line' id='LC949'><span class="cm">	 * @param sql SQL containing bind parameters</span></div><div class='line' id='LC950'><span class="cm">	 * @param pss helper that sets bind parameters. If this is {@code null}</span></div><div class='line' id='LC951'><span class="cm">	 * we run an update with static SQL.</span></div><div class='line' id='LC952'><span class="cm">	 * @return the number of rows affected</span></div><div class='line' id='LC953'><span class="cm">	 * @throws DataAccessException if there is any problem issuing the update</span></div><div class='line' id='LC954'><span class="cm">	 */</span></div><div class='line' id='LC955'>	<span class="kt">int</span> <span class="nf">update</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">PreparedStatementSetter</span> <span class="n">pss</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC956'><br/></div><div class='line' id='LC957'>	<span class="cm">/**</span></div><div class='line' id='LC958'><span class="cm">	 * Issue a single SQL update operation (such as an insert, update or delete statement)</span></div><div class='line' id='LC959'><span class="cm">	 * via a prepared statement, binding the given arguments.</span></div><div class='line' id='LC960'><span class="cm">	 * @param sql SQL containing bind parameters</span></div><div class='line' id='LC961'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC962'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC963'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC964'><span class="cm">	 * @return the number of rows affected</span></div><div class='line' id='LC965'><span class="cm">	 * @throws DataAccessException if there is any problem issuing the update</span></div><div class='line' id='LC966'><span class="cm">	 * @see java.sql.Types</span></div><div class='line' id='LC967'><span class="cm">	 */</span></div><div class='line' id='LC968'>	<span class="kt">int</span> <span class="nf">update</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">[]</span> <span class="n">args</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC969'><br/></div><div class='line' id='LC970'>	<span class="cm">/**</span></div><div class='line' id='LC971'><span class="cm">	 * Issue a single SQL update operation (such as an insert, update or delete statement)</span></div><div class='line' id='LC972'><span class="cm">	 * via a prepared statement, binding the given arguments.</span></div><div class='line' id='LC973'><span class="cm">	 * @param sql SQL containing bind parameters</span></div><div class='line' id='LC974'><span class="cm">	 * @param args arguments to bind to the query</span></div><div class='line' id='LC975'><span class="cm">	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);</span></div><div class='line' id='LC976'><span class="cm">	 * may also contain {@link SqlParameterValue} objects which indicate not</span></div><div class='line' id='LC977'><span class="cm">	 * only the argument value but also the SQL type and optionally the scale</span></div><div class='line' id='LC978'><span class="cm">	 * @return the number of rows affected</span></div><div class='line' id='LC979'><span class="cm">	 * @throws DataAccessException if there is any problem issuing the update</span></div><div class='line' id='LC980'><span class="cm">	 */</span></div><div class='line' id='LC981'>	<span class="kt">int</span> <span class="nf">update</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Object</span><span class="o">...</span> <span class="n">args</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC982'><br/></div><div class='line' id='LC983'>	<span class="cm">/**</span></div><div class='line' id='LC984'><span class="cm">	 * Issue multiple update statements on a single PreparedStatement,</span></div><div class='line' id='LC985'><span class="cm">	 * using batch updates and a BatchPreparedStatementSetter to set values.</span></div><div class='line' id='LC986'><span class="cm">	 * &lt;p&gt;Will fall back to separate updates on a single PreparedStatement</span></div><div class='line' id='LC987'><span class="cm">	 * if the JDBC driver does not support batch updates.</span></div><div class='line' id='LC988'><span class="cm">	 * @param sql defining PreparedStatement that will be reused.</span></div><div class='line' id='LC989'><span class="cm">	 * All statements in the batch will use the same SQL.</span></div><div class='line' id='LC990'><span class="cm">	 * @param pss object to set parameters on the PreparedStatement</span></div><div class='line' id='LC991'><span class="cm">	 * created by this method</span></div><div class='line' id='LC992'><span class="cm">	 * @return an array of the number of rows affected by each statement</span></div><div class='line' id='LC993'><span class="cm">	 * @throws DataAccessException if there is any problem issuing the update</span></div><div class='line' id='LC994'><span class="cm">	 */</span></div><div class='line' id='LC995'>	<span class="kt">int</span><span class="o">[]</span> <span class="nf">batchUpdate</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">BatchPreparedStatementSetter</span> <span class="n">pss</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC996'><br/></div><div class='line' id='LC997'>	<span class="cm">/**</span></div><div class='line' id='LC998'><span class="cm">	 * Execute a batch using the supplied SQL statement with the batch of supplied arguments.</span></div><div class='line' id='LC999'><span class="cm">	 * @param sql the SQL statement to execute</span></div><div class='line' id='LC1000'><span class="cm">	 * @param batchArgs the List of Object arrays containing the batch of arguments for the query</span></div><div class='line' id='LC1001'><span class="cm">	 * @return an array containing the numbers of rows affected by each update in the batch</span></div><div class='line' id='LC1002'><span class="cm">	 */</span></div><div class='line' id='LC1003'>	<span class="kd">public</span> <span class="kt">int</span><span class="o">[]</span> <span class="nf">batchUpdate</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">[]&gt;</span> <span class="n">batchArgs</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC1004'><br/></div><div class='line' id='LC1005'>	<span class="cm">/**</span></div><div class='line' id='LC1006'><span class="cm">	 * Execute a batch using the supplied SQL statement with the batch of supplied arguments.</span></div><div class='line' id='LC1007'><span class="cm">	 * @param sql the SQL statement to execute.</span></div><div class='line' id='LC1008'><span class="cm">	 * @param batchArgs the List of Object arrays containing the batch of arguments for the query</span></div><div class='line' id='LC1009'><span class="cm">	 * @param argTypes SQL types of the arguments</span></div><div class='line' id='LC1010'><span class="cm">	 * (constants from {@code java.sql.Types})</span></div><div class='line' id='LC1011'><span class="cm">	 * @return an array containing the numbers of rows affected by each update in the batch</span></div><div class='line' id='LC1012'><span class="cm">	 */</span></div><div class='line' id='LC1013'>	<span class="kd">public</span> <span class="kt">int</span><span class="o">[]</span> <span class="nf">batchUpdate</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">Object</span><span class="o">[]&gt;</span> <span class="n">batchArgs</span><span class="o">,</span> <span class="kt">int</span><span class="o">[]</span> <span class="n">argTypes</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC1014'><br/></div><div class='line' id='LC1015'>	<span class="cm">/**</span></div><div class='line' id='LC1016'><span class="cm">	 * Execute multiple batches using the supplied SQL statement with the collect of supplied arguments.</span></div><div class='line' id='LC1017'><span class="cm">	 * The arguments&#39; values will be set using the ParameterizedPreparedStatementSetter.</span></div><div class='line' id='LC1018'><span class="cm">	 * Each batch should be of size indicated in &#39;batchSize&#39;.</span></div><div class='line' id='LC1019'><span class="cm">	 * @param sql the SQL statement to execute.</span></div><div class='line' id='LC1020'><span class="cm">	 * @param batchArgs the List of Object arrays containing the batch of arguments for the query</span></div><div class='line' id='LC1021'><span class="cm">	 * @param batchSize batch size</span></div><div class='line' id='LC1022'><span class="cm">	 * @param pss ParameterizedPreparedStatementSetter to use</span></div><div class='line' id='LC1023'><span class="cm">	 * @return an array containing for each batch another array containing the numbers of rows affected</span></div><div class='line' id='LC1024'><span class="cm">	 * by each update in the batch</span></div><div class='line' id='LC1025'><span class="cm">	 */</span></div><div class='line' id='LC1026'>	<span class="kd">public</span> <span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="kt">int</span><span class="o">[][]</span> <span class="n">batchUpdate</span><span class="o">(</span><span class="n">String</span> <span class="n">sql</span><span class="o">,</span> <span class="n">Collection</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">batchArgs</span><span class="o">,</span> <span class="kt">int</span> <span class="n">batchSize</span><span class="o">,</span></div><div class='line' id='LC1027'>			<span class="n">ParameterizedPreparedStatementSetter</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">pss</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC1028'><br/></div><div class='line' id='LC1029'><br/></div><div class='line' id='LC1030'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC1031'>	<span class="c1">// Methods dealing with callable statements</span></div><div class='line' id='LC1032'>	<span class="c1">//-------------------------------------------------------------------------</span></div><div class='line' id='LC1033'><br/></div><div class='line' id='LC1034'>	<span class="cm">/**</span></div><div class='line' id='LC1035'><span class="cm">	 * Execute a JDBC data access operation, implemented as callback action</span></div><div class='line' id='LC1036'><span class="cm">	 * working on a JDBC CallableStatement. This allows for implementing arbitrary</span></div><div class='line' id='LC1037'><span class="cm">	 * data access operations on a single Statement, within Spring&#39;s managed</span></div><div class='line' id='LC1038'><span class="cm">	 * JDBC environment: that is, participating in Spring-managed transactions</span></div><div class='line' id='LC1039'><span class="cm">	 * and converting JDBC SQLExceptions into Spring&#39;s DataAccessException hierarchy.</span></div><div class='line' id='LC1040'><span class="cm">	 * &lt;p&gt;The callback action can return a result object, for example a</span></div><div class='line' id='LC1041'><span class="cm">	 * domain object or a collection of domain objects.</span></div><div class='line' id='LC1042'><span class="cm">	 * @param csc object that can create a CallableStatement given a Connection</span></div><div class='line' id='LC1043'><span class="cm">	 * @param action callback object that specifies the action</span></div><div class='line' id='LC1044'><span class="cm">	 * @return a result object returned by the action, or {@code null}</span></div><div class='line' id='LC1045'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC1046'><span class="cm">	 */</span></div><div class='line' id='LC1047'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">execute</span><span class="o">(</span><span class="n">CallableStatementCreator</span> <span class="n">csc</span><span class="o">,</span> <span class="n">CallableStatementCallback</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">action</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC1048'><br/></div><div class='line' id='LC1049'>	<span class="cm">/**</span></div><div class='line' id='LC1050'><span class="cm">	 * Execute a JDBC data access operation, implemented as callback action</span></div><div class='line' id='LC1051'><span class="cm">	 * working on a JDBC CallableStatement. This allows for implementing arbitrary</span></div><div class='line' id='LC1052'><span class="cm">	 * data access operations on a single Statement, within Spring&#39;s managed</span></div><div class='line' id='LC1053'><span class="cm">	 * JDBC environment: that is, participating in Spring-managed transactions</span></div><div class='line' id='LC1054'><span class="cm">	 * and converting JDBC SQLExceptions into Spring&#39;s DataAccessException hierarchy.</span></div><div class='line' id='LC1055'><span class="cm">	 * &lt;p&gt;The callback action can return a result object, for example a</span></div><div class='line' id='LC1056'><span class="cm">	 * domain object or a collection of domain objects.</span></div><div class='line' id='LC1057'><span class="cm">	 * @param callString the SQL call string to execute</span></div><div class='line' id='LC1058'><span class="cm">	 * @param action callback object that specifies the action</span></div><div class='line' id='LC1059'><span class="cm">	 * @return a result object returned by the action, or {@code null}</span></div><div class='line' id='LC1060'><span class="cm">	 * @throws DataAccessException if there is any problem</span></div><div class='line' id='LC1061'><span class="cm">	 */</span></div><div class='line' id='LC1062'>	<span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">T</span> <span class="n">execute</span><span class="o">(</span><span class="n">String</span> <span class="n">callString</span><span class="o">,</span> <span class="n">CallableStatementCallback</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">action</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC1063'><br/></div><div class='line' id='LC1064'>	<span class="cm">/**</span></div><div class='line' id='LC1065'><span class="cm">	 * Execute a SQL call using a CallableStatementCreator to provide SQL and any</span></div><div class='line' id='LC1066'><span class="cm">	 * required parameters.</span></div><div class='line' id='LC1067'><span class="cm">	 * @param csc object that provides SQL and any necessary parameters</span></div><div class='line' id='LC1068'><span class="cm">	 * @param declaredParameters list of declared SqlParameter objects</span></div><div class='line' id='LC1069'><span class="cm">	 * @return Map of extracted out parameters</span></div><div class='line' id='LC1070'><span class="cm">	 * @throws DataAccessException if there is any problem issuing the update</span></div><div class='line' id='LC1071'><span class="cm">	 */</span></div><div class='line' id='LC1072'>	<span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">Object</span><span class="o">&gt;</span> <span class="n">call</span><span class="o">(</span><span class="n">CallableStatementCreator</span> <span class="n">csc</span><span class="o">,</span> <span class="n">List</span><span class="o">&lt;</span><span class="n">SqlParameter</span><span class="o">&gt;</span> <span class="n">declaredParameters</span><span class="o">)</span></div><div class='line' id='LC1073'>			<span class="kd">throws</span> <span class="n">DataAccessException</span><span class="o">;</span></div><div class='line' id='LC1074'><br/></div><div class='line' id='LC1075'><span class="o">}</span></div></pre></div></td>
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
      <li>&copy; 2014 <span title="0.09934s from github-fe116-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
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


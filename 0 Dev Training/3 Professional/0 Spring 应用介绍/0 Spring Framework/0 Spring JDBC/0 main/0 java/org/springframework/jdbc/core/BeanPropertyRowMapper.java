




<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>spring-framework/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java at master · spring-projects/spring-framework · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="spring-projects/spring-framework" name="twitter:title" /><meta content="spring-framework - The Spring Framework" name="twitter:description" /><meta content="https://2.gravatar.com/avatar/6f8a529bd100f4272a9ff1b8cdfbd26e?d=https%3A%2F%2Fidenticons.github.com%2Ff69a6111b59799984ef69ab92e633d83.png&amp;r=x&amp;s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://2.gravatar.com/avatar/6f8a529bd100f4272a9ff1b8cdfbd26e?d=https%3A%2F%2Fidenticons.github.com%2Ff69a6111b59799984ef69ab92e633d83.png&amp;r=x&amp;s=400" property="og:image" /><meta content="spring-projects/spring-framework" property="og:title" /><meta content="https://github.com/spring-projects/spring-framework" property="og:url" /><meta content="spring-framework - The Spring Framework" property="og:description" />

    <meta name="hostname" content="github-fe137-cp1-prd.iad.github.net">
    <meta name="ruby" content="ruby 2.1.0p0-github-tcmalloc (87c9373a41) [x86_64-linux]">
    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />


    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="6A786901:3BDF:26E550A:53182DA0" name="octolytics-dimension-request_id" />
    

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="rtcw2YROF7Dn27ZT6eFB7+YTxHeb/yojn8THXAv4ni8=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-ce7ab9b7dbd81fa8f2eeff348bc97553a3eaf80c.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-729e3ebdf8b0ec6ed54532c398dc8bd48d25ea1f.css" media="all" rel="stylesheet" type="text/css" />
    
    


      <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-490867a148cf94468c141093ccd4e56ed2144eb9.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-a0f1f6f8ff5a4a3b8f453ec1095a25636480fbb8.js" type="text/javascript"></script>
      
      <meta http-equiv="x-pjax-version" content="7b67821226317b7dab62603ad6dd2719">

        <link data-pjax-transient rel='permalink' href='/spring-projects/spring-framework/blob/49d7bda72248b5a08fda3d42ed10d9e127396e6a/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java'>

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
      <a class="button signin" href="/login?return_to=%2Fspring-projects%2Fspring-framework%2Fblob%2Fmaster%2Fspring-jdbc%2Fsrc%2Fmain%2Fjava%2Forg%2Fspringframework%2Fjdbc%2Fcore%2FBeanPropertyRowMapper.java">Sign in</a>
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
          


<!-- blob contrib key: blob_contributors:v21:43969c6e75076191188af07435114259 -->

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
              <a href="/spring-projects/spring-framework/blob/3.0.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="3.0.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.0.x">3.0.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/3.1.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="3.1.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.1.x">3.1.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/3.2.x/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="3.2.x"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="3.2.x">3.2.x</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/beanbuilder/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="beanbuilder"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="beanbuilder">beanbuilder</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/conversation/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="conversation"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="conversation">conversation</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/gh-pages/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="gh-pages"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="gh-pages">gh-pages</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/blob/resource-handling/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
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
              <a href="/spring-projects/spring-framework/tree/v4.0.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.2.RELEASE">v4.0.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.1.RELEASE">v4.0.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RELEASE">v4.0.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RC2">v4.0.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.RC1">v4.0.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M3/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.0.M3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M3">v4.0.0.M3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M2">v4.0.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v4.0.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v4.0.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v4.0.0.M1">v4.0.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.8.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.8.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.8.RELEASE">v3.2.8.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.7.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.7.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.7.RELEASE">v3.2.7.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.6.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.6.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.6.RELEASE">v3.2.6.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.5.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.5.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.5.RELEASE">v3.2.5.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.4.RELEASE">v3.2.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.3.RELEASE">v3.2.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.2.RELEASE">v3.2.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.1.RELEASE">v3.2.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RELEASE">v3.2.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC2-A/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.0.RC2-A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC2-A">v3.2.0.RC2-A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC2">v3.2.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.RC1">v3.2.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.M2">v3.2.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.2.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.2.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.2.0.M1">v3.2.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.4.RELEASE">v3.1.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.3.RELEASE">v3.1.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.2.RELEASE">v3.1.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.1.RELEASE">v3.1.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RELEASE">v3.1.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RC2">v3.1.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.RC1">v3.1.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.M2">v3.1.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.1.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.1.0.M1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.1.0.M1">v3.1.0.M1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.7.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.7.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.7.RELEASE">v3.0.7.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.6.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.6.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.6.RELEASE">v3.0.6.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.5.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.5.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.5.RELEASE">v3.0.5.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.4.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.4.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.4.RELEASE">v3.0.4.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.3.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.3.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.3.RELEASE">v3.0.3.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.2.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.2.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.2.RELEASE">v3.0.2.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE.A/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.1.RELEASE.A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE.A">v3.0.1.RELEASE.A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE-A/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.1.RELEASE-A"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE-A">v3.0.1.RELEASE-A</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.1.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.1.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.1.RELEASE">v3.0.1.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RELEASE/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.0.RELEASE"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RELEASE">v3.0.0.RELEASE</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC3/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.0.RC3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC3">v3.0.0.RC3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.0.RC2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC2">v3.0.0.RC2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.RC1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.0.RC1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.RC1">v3.0.0.RC1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M4/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.0.M4"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M4">v3.0.0.M4</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M3/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.0.M3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M3">v3.0.0.M3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M2/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
                 data-name="v3.0.0.M2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="v3.0.0.M2">v3.0.0.M2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/spring-projects/spring-framework/tree/v3.0.0.M1/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java"
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
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">spring-framework</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">spring-jdbc</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">main</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">java</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">org</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">springframework</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework/jdbc" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">jdbc</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/spring-projects/spring-framework/tree/master/spring-jdbc/src/main/java/org/springframework/jdbc/core" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">core</span></a></span><span class="separator"> / </span><strong class="final-path">BeanPropertyRowMapper.java</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/spring-projects/spring-framework/contributors/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java">
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
          <span>327 lines (291 sloc)</span>
          <span class="meta-divider"></span>
        <span>11.887 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="http://windows.github.com" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
              <a class="minibutton disabled tooltipped tooltipped-w" href="#"
                 aria-label="You must be signed in to make or propose changes">Edit</a>
          <a href="/spring-projects/spring-framework/raw/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java" class="button minibutton " id="raw-url">Raw</a>
            <a href="/spring-projects/spring-framework/blame/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/spring-projects/spring-framework/commits/master/spring-jdbc/src/main/java/org/springframework/jdbc/core/BeanPropertyRowMapper.java" class="button minibutton " rel="nofollow">History</a>
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

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="cm">/*</span></div><div class='line' id='LC2'><span class="cm"> * Copyright 2002-2013 the original author or authors.</span></div><div class='line' id='LC3'><span class="cm"> *</span></div><div class='line' id='LC4'><span class="cm"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></div><div class='line' id='LC5'><span class="cm"> * you may not use this file except in compliance with the License.</span></div><div class='line' id='LC6'><span class="cm"> * You may obtain a copy of the License at</span></div><div class='line' id='LC7'><span class="cm"> *</span></div><div class='line' id='LC8'><span class="cm"> *      http://www.apache.org/licenses/LICENSE-2.0</span></div><div class='line' id='LC9'><span class="cm"> *</span></div><div class='line' id='LC10'><span class="cm"> * Unless required by applicable law or agreed to in writing, software</span></div><div class='line' id='LC11'><span class="cm"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></div><div class='line' id='LC12'><span class="cm"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></div><div class='line' id='LC13'><span class="cm"> * See the License for the specific language governing permissions and</span></div><div class='line' id='LC14'><span class="cm"> * limitations under the License.</span></div><div class='line' id='LC15'><span class="cm"> */</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="kn">package</span> <span class="n">org</span><span class="o">.</span><span class="na">springframework</span><span class="o">.</span><span class="na">jdbc</span><span class="o">.</span><span class="na">core</span><span class="o">;</span></div><div class='line' id='LC18'><br/></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">java.beans.PropertyDescriptor</span><span class="o">;</span></div><div class='line' id='LC20'><span class="kn">import</span> <span class="nn">java.sql.ResultSet</span><span class="o">;</span></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">java.sql.ResultSetMetaData</span><span class="o">;</span></div><div class='line' id='LC22'><span class="kn">import</span> <span class="nn">java.sql.SQLException</span><span class="o">;</span></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">java.util.HashMap</span><span class="o">;</span></div><div class='line' id='LC24'><span class="kn">import</span> <span class="nn">java.util.HashSet</span><span class="o">;</span></div><div class='line' id='LC25'><span class="kn">import</span> <span class="nn">java.util.Map</span><span class="o">;</span></div><div class='line' id='LC26'><span class="kn">import</span> <span class="nn">java.util.Set</span><span class="o">;</span></div><div class='line' id='LC27'><br/></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">org.apache.commons.logging.Log</span><span class="o">;</span></div><div class='line' id='LC29'><span class="kn">import</span> <span class="nn">org.apache.commons.logging.LogFactory</span><span class="o">;</span></div><div class='line' id='LC30'><br/></div><div class='line' id='LC31'><span class="kn">import</span> <span class="nn">org.springframework.beans.BeanUtils</span><span class="o">;</span></div><div class='line' id='LC32'><span class="kn">import</span> <span class="nn">org.springframework.beans.BeanWrapper</span><span class="o">;</span></div><div class='line' id='LC33'><span class="kn">import</span> <span class="nn">org.springframework.beans.NotWritablePropertyException</span><span class="o">;</span></div><div class='line' id='LC34'><span class="kn">import</span> <span class="nn">org.springframework.beans.PropertyAccessorFactory</span><span class="o">;</span></div><div class='line' id='LC35'><span class="kn">import</span> <span class="nn">org.springframework.beans.TypeMismatchException</span><span class="o">;</span></div><div class='line' id='LC36'><span class="kn">import</span> <span class="nn">org.springframework.dao.DataRetrievalFailureException</span><span class="o">;</span></div><div class='line' id='LC37'><span class="kn">import</span> <span class="nn">org.springframework.dao.InvalidDataAccessApiUsageException</span><span class="o">;</span></div><div class='line' id='LC38'><span class="kn">import</span> <span class="nn">org.springframework.jdbc.support.JdbcUtils</span><span class="o">;</span></div><div class='line' id='LC39'><span class="kn">import</span> <span class="nn">org.springframework.util.Assert</span><span class="o">;</span></div><div class='line' id='LC40'><span class="kn">import</span> <span class="nn">org.springframework.util.StringUtils</span><span class="o">;</span></div><div class='line' id='LC41'><br/></div><div class='line' id='LC42'><span class="cm">/**</span></div><div class='line' id='LC43'><span class="cm"> * {@link RowMapper} implementation that converts a row into a new instance</span></div><div class='line' id='LC44'><span class="cm"> * of the specified mapped target class. The mapped target class must be a</span></div><div class='line' id='LC45'><span class="cm"> * top-level class and it must have a default or no-arg constructor.</span></div><div class='line' id='LC46'><span class="cm"> *</span></div><div class='line' id='LC47'><span class="cm"> * &lt;p&gt;Column values are mapped based on matching the column name as obtained from result set</span></div><div class='line' id='LC48'><span class="cm"> * metadata to public setters for the corresponding properties. The names are matched either</span></div><div class='line' id='LC49'><span class="cm"> * directly or by transforming a name separating the parts with underscores to the same name</span></div><div class='line' id='LC50'><span class="cm"> * using &quot;camel&quot; case.</span></div><div class='line' id='LC51'><span class="cm"> *</span></div><div class='line' id='LC52'><span class="cm"> * &lt;p&gt;Mapping is provided for fields in the target class for many common types, e.g.:</span></div><div class='line' id='LC53'><span class="cm"> * String, boolean, Boolean, byte, Byte, short, Short, int, Integer, long, Long,</span></div><div class='line' id='LC54'><span class="cm"> * float, Float, double, Double, BigDecimal, {@code java.util.Date}, etc.</span></div><div class='line' id='LC55'><span class="cm"> *</span></div><div class='line' id='LC56'><span class="cm"> * &lt;p&gt;To facilitate mapping between columns and fields that don&#39;t have matching names,</span></div><div class='line' id='LC57'><span class="cm"> * try using column aliases in the SQL statement like &quot;select fname as first_name from customer&quot;.</span></div><div class='line' id='LC58'><span class="cm"> *</span></div><div class='line' id='LC59'><span class="cm"> * &lt;p&gt;For &#39;null&#39; values read from the databasem, we will attempt to call the setter, but in the case of</span></div><div class='line' id='LC60'><span class="cm"> * Java primitives, this causes a TypeMismatchException. This class can be configured (using the</span></div><div class='line' id='LC61'><span class="cm"> * primitivesDefaultedForNullValue property) to trap this exception and use the primitives default value.</span></div><div class='line' id='LC62'><span class="cm"> * Be aware that if you use the values from the generated bean to update the database the primitive value</span></div><div class='line' id='LC63'><span class="cm"> * will have been set to the primitive&#39;s default value instead of null.</span></div><div class='line' id='LC64'><span class="cm"> *</span></div><div class='line' id='LC65'><span class="cm"> * &lt;p&gt;Please note that this class is designed to provide convenience rather than high performance.</span></div><div class='line' id='LC66'><span class="cm"> * For best performance consider using a custom RowMapper.</span></div><div class='line' id='LC67'><span class="cm"> *</span></div><div class='line' id='LC68'><span class="cm"> * @author Thomas Risberg</span></div><div class='line' id='LC69'><span class="cm"> * @author Juergen Hoeller</span></div><div class='line' id='LC70'><span class="cm"> * @since 2.5</span></div><div class='line' id='LC71'><span class="cm"> */</span></div><div class='line' id='LC72'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">BeanPropertyRowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="kd">implements</span> <span class="n">RowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="o">{</span></div><div class='line' id='LC73'><br/></div><div class='line' id='LC74'>	<span class="cm">/** Logger available to subclasses */</span></div><div class='line' id='LC75'>	<span class="kd">protected</span> <span class="kd">final</span> <span class="n">Log</span> <span class="n">logger</span> <span class="o">=</span> <span class="n">LogFactory</span><span class="o">.</span><span class="na">getLog</span><span class="o">(</span><span class="n">getClass</span><span class="o">());</span></div><div class='line' id='LC76'><br/></div><div class='line' id='LC77'>	<span class="cm">/** The class we are mapping to */</span></div><div class='line' id='LC78'>	<span class="kd">private</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">mappedClass</span><span class="o">;</span></div><div class='line' id='LC79'><br/></div><div class='line' id='LC80'>	<span class="cm">/** Whether we&#39;re strictly validating */</span></div><div class='line' id='LC81'>	<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">checkFullyPopulated</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC82'><br/></div><div class='line' id='LC83'>	<span class="cm">/** Whether we&#39;re defaulting primitives when mapping a null value */</span></div><div class='line' id='LC84'>	<span class="kd">private</span> <span class="kt">boolean</span> <span class="n">primitivesDefaultedForNullValue</span> <span class="o">=</span> <span class="kc">false</span><span class="o">;</span></div><div class='line' id='LC85'><br/></div><div class='line' id='LC86'>	<span class="cm">/** Map of the fields we provide mapping for */</span></div><div class='line' id='LC87'>	<span class="kd">private</span> <span class="n">Map</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">PropertyDescriptor</span><span class="o">&gt;</span> <span class="n">mappedFields</span><span class="o">;</span></div><div class='line' id='LC88'><br/></div><div class='line' id='LC89'>	<span class="cm">/** Set of bean properties we provide mapping for */</span></div><div class='line' id='LC90'>	<span class="kd">private</span> <span class="n">Set</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">mappedProperties</span><span class="o">;</span></div><div class='line' id='LC91'><br/></div><div class='line' id='LC92'><br/></div><div class='line' id='LC93'>	<span class="cm">/**</span></div><div class='line' id='LC94'><span class="cm">	 * Create a new BeanPropertyRowMapper for bean-style configuration.</span></div><div class='line' id='LC95'><span class="cm">	 * @see #setMappedClass</span></div><div class='line' id='LC96'><span class="cm">	 * @see #setCheckFullyPopulated</span></div><div class='line' id='LC97'><span class="cm">	 */</span></div><div class='line' id='LC98'>	<span class="kd">public</span> <span class="nf">BeanPropertyRowMapper</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC99'>	<span class="o">}</span></div><div class='line' id='LC100'><br/></div><div class='line' id='LC101'>	<span class="cm">/**</span></div><div class='line' id='LC102'><span class="cm">	 * Create a new BeanPropertyRowMapper, accepting unpopulated properties</span></div><div class='line' id='LC103'><span class="cm">	 * in the target bean.</span></div><div class='line' id='LC104'><span class="cm">	 * &lt;p&gt;Consider using the {@link #newInstance} factory method instead,</span></div><div class='line' id='LC105'><span class="cm">	 * which allows for specifying the mapped type once only.</span></div><div class='line' id='LC106'><span class="cm">	 * @param mappedClass the class that each row should be mapped to</span></div><div class='line' id='LC107'><span class="cm">	 */</span></div><div class='line' id='LC108'>	<span class="kd">public</span> <span class="nf">BeanPropertyRowMapper</span><span class="o">(</span><span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">mappedClass</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC109'>		<span class="n">initialize</span><span class="o">(</span><span class="n">mappedClass</span><span class="o">);</span></div><div class='line' id='LC110'>	<span class="o">}</span></div><div class='line' id='LC111'><br/></div><div class='line' id='LC112'>	<span class="cm">/**</span></div><div class='line' id='LC113'><span class="cm">	 * Create a new BeanPropertyRowMapper.</span></div><div class='line' id='LC114'><span class="cm">	 * @param mappedClass the class that each row should be mapped to</span></div><div class='line' id='LC115'><span class="cm">	 * @param checkFullyPopulated whether we&#39;re strictly validating that</span></div><div class='line' id='LC116'><span class="cm">	 * all bean properties have been mapped from corresponding database fields</span></div><div class='line' id='LC117'><span class="cm">	 */</span></div><div class='line' id='LC118'>	<span class="kd">public</span> <span class="nf">BeanPropertyRowMapper</span><span class="o">(</span><span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">mappedClass</span><span class="o">,</span> <span class="kt">boolean</span> <span class="n">checkFullyPopulated</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC119'>		<span class="n">initialize</span><span class="o">(</span><span class="n">mappedClass</span><span class="o">);</span></div><div class='line' id='LC120'>		<span class="k">this</span><span class="o">.</span><span class="na">checkFullyPopulated</span> <span class="o">=</span> <span class="n">checkFullyPopulated</span><span class="o">;</span></div><div class='line' id='LC121'>	<span class="o">}</span></div><div class='line' id='LC122'><br/></div><div class='line' id='LC123'><br/></div><div class='line' id='LC124'>	<span class="cm">/**</span></div><div class='line' id='LC125'><span class="cm">	 * Set the class that each row should be mapped to.</span></div><div class='line' id='LC126'><span class="cm">	 */</span></div><div class='line' id='LC127'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setMappedClass</span><span class="o">(</span><span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">mappedClass</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC128'>		<span class="k">if</span> <span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC129'>			<span class="n">initialize</span><span class="o">(</span><span class="n">mappedClass</span><span class="o">);</span></div><div class='line' id='LC130'>		<span class="o">}</span></div><div class='line' id='LC131'>		<span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC132'>			<span class="k">if</span> <span class="o">(!</span><span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">mappedClass</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC133'>				<span class="k">throw</span> <span class="k">new</span> <span class="nf">InvalidDataAccessApiUsageException</span><span class="o">(</span><span class="s">&quot;The mapped class can not be reassigned to map to &quot;</span> <span class="o">+</span></div><div class='line' id='LC134'>						<span class="n">mappedClass</span> <span class="o">+</span> <span class="s">&quot; since it is already providing mapping for &quot;</span> <span class="o">+</span> <span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span><span class="o">);</span></div><div class='line' id='LC135'>			<span class="o">}</span></div><div class='line' id='LC136'>		<span class="o">}</span></div><div class='line' id='LC137'>	<span class="o">}</span></div><div class='line' id='LC138'><br/></div><div class='line' id='LC139'>	<span class="cm">/**</span></div><div class='line' id='LC140'><span class="cm">	 * Initialize the mapping metadata for the given class.</span></div><div class='line' id='LC141'><span class="cm">	 * @param mappedClass the mapped class.</span></div><div class='line' id='LC142'><span class="cm">	 */</span></div><div class='line' id='LC143'>	<span class="kd">protected</span> <span class="kt">void</span> <span class="nf">initialize</span><span class="o">(</span><span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">mappedClass</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC144'>		<span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span> <span class="o">=</span> <span class="n">mappedClass</span><span class="o">;</span></div><div class='line' id='LC145'>		<span class="k">this</span><span class="o">.</span><span class="na">mappedFields</span> <span class="o">=</span> <span class="k">new</span> <span class="n">HashMap</span><span class="o">&lt;</span><span class="n">String</span><span class="o">,</span> <span class="n">PropertyDescriptor</span><span class="o">&gt;();</span></div><div class='line' id='LC146'>		<span class="k">this</span><span class="o">.</span><span class="na">mappedProperties</span> <span class="o">=</span> <span class="k">new</span> <span class="n">HashSet</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;();</span></div><div class='line' id='LC147'>		<span class="n">PropertyDescriptor</span><span class="o">[]</span> <span class="n">pds</span> <span class="o">=</span> <span class="n">BeanUtils</span><span class="o">.</span><span class="na">getPropertyDescriptors</span><span class="o">(</span><span class="n">mappedClass</span><span class="o">);</span></div><div class='line' id='LC148'>		<span class="k">for</span> <span class="o">(</span><span class="n">PropertyDescriptor</span> <span class="n">pd</span> <span class="o">:</span> <span class="n">pds</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC149'>			<span class="k">if</span> <span class="o">(</span><span class="n">pd</span><span class="o">.</span><span class="na">getWriteMethod</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC150'>				<span class="k">this</span><span class="o">.</span><span class="na">mappedFields</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">().</span><span class="na">toLowerCase</span><span class="o">(),</span> <span class="n">pd</span><span class="o">);</span></div><div class='line' id='LC151'>				<span class="n">String</span> <span class="n">underscoredName</span> <span class="o">=</span> <span class="n">underscoreName</span><span class="o">(</span><span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></div><div class='line' id='LC152'>				<span class="k">if</span> <span class="o">(!</span><span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">().</span><span class="na">toLowerCase</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="n">underscoredName</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC153'>					<span class="k">this</span><span class="o">.</span><span class="na">mappedFields</span><span class="o">.</span><span class="na">put</span><span class="o">(</span><span class="n">underscoredName</span><span class="o">,</span> <span class="n">pd</span><span class="o">);</span></div><div class='line' id='LC154'>				<span class="o">}</span></div><div class='line' id='LC155'>				<span class="k">this</span><span class="o">.</span><span class="na">mappedProperties</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></div><div class='line' id='LC156'>			<span class="o">}</span></div><div class='line' id='LC157'>		<span class="o">}</span></div><div class='line' id='LC158'>	<span class="o">}</span></div><div class='line' id='LC159'><br/></div><div class='line' id='LC160'>	<span class="cm">/**</span></div><div class='line' id='LC161'><span class="cm">	 * Convert a name in camelCase to an underscored name in lower case.</span></div><div class='line' id='LC162'><span class="cm">	 * Any upper case letters are converted to lower case with a preceding underscore.</span></div><div class='line' id='LC163'><span class="cm">	 * @param name the string containing original name</span></div><div class='line' id='LC164'><span class="cm">	 * @return the converted name</span></div><div class='line' id='LC165'><span class="cm">	 */</span></div><div class='line' id='LC166'>	<span class="kd">private</span> <span class="n">String</span> <span class="nf">underscoreName</span><span class="o">(</span><span class="n">String</span> <span class="n">name</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC167'>		<span class="k">if</span> <span class="o">(!</span><span class="n">StringUtils</span><span class="o">.</span><span class="na">hasLength</span><span class="o">(</span><span class="n">name</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC168'>			<span class="k">return</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC169'>		<span class="o">}</span></div><div class='line' id='LC170'>		<span class="n">StringBuilder</span> <span class="n">result</span> <span class="o">=</span> <span class="k">new</span> <span class="n">StringBuilder</span><span class="o">();</span></div><div class='line' id='LC171'>		<span class="n">result</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">name</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="mi">0</span><span class="o">,</span> <span class="mi">1</span><span class="o">).</span><span class="na">toLowerCase</span><span class="o">());</span></div><div class='line' id='LC172'>		<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">name</span><span class="o">.</span><span class="na">length</span><span class="o">();</span> <span class="n">i</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC173'>			<span class="n">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">name</span><span class="o">.</span><span class="na">substring</span><span class="o">(</span><span class="n">i</span><span class="o">,</span> <span class="n">i</span> <span class="o">+</span> <span class="mi">1</span><span class="o">);</span></div><div class='line' id='LC174'>			<span class="n">String</span> <span class="n">slc</span> <span class="o">=</span> <span class="n">s</span><span class="o">.</span><span class="na">toLowerCase</span><span class="o">();</span></div><div class='line' id='LC175'>			<span class="k">if</span> <span class="o">(!</span><span class="n">s</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">slc</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC176'>				<span class="n">result</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="s">&quot;_&quot;</span><span class="o">).</span><span class="na">append</span><span class="o">(</span><span class="n">slc</span><span class="o">);</span></div><div class='line' id='LC177'>			<span class="o">}</span></div><div class='line' id='LC178'>			<span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC179'>				<span class="n">result</span><span class="o">.</span><span class="na">append</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></div><div class='line' id='LC180'>			<span class="o">}</span></div><div class='line' id='LC181'>		<span class="o">}</span></div><div class='line' id='LC182'>		<span class="k">return</span> <span class="n">result</span><span class="o">.</span><span class="na">toString</span><span class="o">();</span></div><div class='line' id='LC183'>	<span class="o">}</span></div><div class='line' id='LC184'><br/></div><div class='line' id='LC185'>	<span class="cm">/**</span></div><div class='line' id='LC186'><span class="cm">	 * Get the class that we are mapping to.</span></div><div class='line' id='LC187'><span class="cm">	 */</span></div><div class='line' id='LC188'>	<span class="kd">public</span> <span class="kd">final</span> <span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="nf">getMappedClass</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC189'>		<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span><span class="o">;</span></div><div class='line' id='LC190'>	<span class="o">}</span></div><div class='line' id='LC191'><br/></div><div class='line' id='LC192'>	<span class="cm">/**</span></div><div class='line' id='LC193'><span class="cm">	 * Set whether we&#39;re strictly validating that all bean properties have been</span></div><div class='line' id='LC194'><span class="cm">	 * mapped from corresponding database fields.</span></div><div class='line' id='LC195'><span class="cm">	 * &lt;p&gt;Default is {@code false}, accepting unpopulated properties in the</span></div><div class='line' id='LC196'><span class="cm">	 * target bean.</span></div><div class='line' id='LC197'><span class="cm">	 */</span></div><div class='line' id='LC198'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setCheckFullyPopulated</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">checkFullyPopulated</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC199'>		<span class="k">this</span><span class="o">.</span><span class="na">checkFullyPopulated</span> <span class="o">=</span> <span class="n">checkFullyPopulated</span><span class="o">;</span></div><div class='line' id='LC200'>	<span class="o">}</span></div><div class='line' id='LC201'><br/></div><div class='line' id='LC202'>	<span class="cm">/**</span></div><div class='line' id='LC203'><span class="cm">	 * Return whether we&#39;re strictly validating that all bean properties have been</span></div><div class='line' id='LC204'><span class="cm">	 * mapped from corresponding database fields.</span></div><div class='line' id='LC205'><span class="cm">	 */</span></div><div class='line' id='LC206'>	<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isCheckFullyPopulated</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC207'>		<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">checkFullyPopulated</span><span class="o">;</span></div><div class='line' id='LC208'>	<span class="o">}</span></div><div class='line' id='LC209'><br/></div><div class='line' id='LC210'>	<span class="cm">/**</span></div><div class='line' id='LC211'><span class="cm">	 * Set whether we&#39;re defaulting Java primitives in the case of mapping a null value</span></div><div class='line' id='LC212'><span class="cm">	 * from corresponding database fields.</span></div><div class='line' id='LC213'><span class="cm">	 * &lt;p&gt;Default is {@code false}, throwing an exception when nulls are mapped to Java primitives.</span></div><div class='line' id='LC214'><span class="cm">	 */</span></div><div class='line' id='LC215'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">setPrimitivesDefaultedForNullValue</span><span class="o">(</span><span class="kt">boolean</span> <span class="n">primitivesDefaultedForNullValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC216'>		<span class="k">this</span><span class="o">.</span><span class="na">primitivesDefaultedForNullValue</span> <span class="o">=</span> <span class="n">primitivesDefaultedForNullValue</span><span class="o">;</span></div><div class='line' id='LC217'>	<span class="o">}</span></div><div class='line' id='LC218'><br/></div><div class='line' id='LC219'>	<span class="cm">/**</span></div><div class='line' id='LC220'><span class="cm">	 * Return whether we&#39;re defaulting Java primitives in the case of mapping a null value</span></div><div class='line' id='LC221'><span class="cm">	 * from corresponding database fields.</span></div><div class='line' id='LC222'><span class="cm">	 */</span></div><div class='line' id='LC223'>	<span class="kd">public</span> <span class="kt">boolean</span> <span class="nf">isPrimitivesDefaultedForNullValue</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC224'>		<span class="k">return</span> <span class="n">primitivesDefaultedForNullValue</span><span class="o">;</span></div><div class='line' id='LC225'>	<span class="o">}</span></div><div class='line' id='LC226'><br/></div><div class='line' id='LC227'><br/></div><div class='line' id='LC228'>	<span class="cm">/**</span></div><div class='line' id='LC229'><span class="cm">	 * Extract the values for all columns in the current row.</span></div><div class='line' id='LC230'><span class="cm">	 * &lt;p&gt;Utilizes public setters and result set metadata.</span></div><div class='line' id='LC231'><span class="cm">	 * @see java.sql.ResultSetMetaData</span></div><div class='line' id='LC232'><span class="cm">	 */</span></div><div class='line' id='LC233'>	<span class="nd">@Override</span></div><div class='line' id='LC234'>	<span class="kd">public</span> <span class="n">T</span> <span class="nf">mapRow</span><span class="o">(</span><span class="n">ResultSet</span> <span class="n">rs</span><span class="o">,</span> <span class="kt">int</span> <span class="n">rowNumber</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">SQLException</span> <span class="o">{</span></div><div class='line' id='LC235'>		<span class="n">Assert</span><span class="o">.</span><span class="na">state</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">,</span> <span class="s">&quot;Mapped class was not specified&quot;</span><span class="o">);</span></div><div class='line' id='LC236'>		<span class="n">T</span> <span class="n">mappedObject</span> <span class="o">=</span> <span class="n">BeanUtils</span><span class="o">.</span><span class="na">instantiate</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span><span class="o">);</span></div><div class='line' id='LC237'>		<span class="n">BeanWrapper</span> <span class="n">bw</span> <span class="o">=</span> <span class="n">PropertyAccessorFactory</span><span class="o">.</span><span class="na">forBeanPropertyAccess</span><span class="o">(</span><span class="n">mappedObject</span><span class="o">);</span></div><div class='line' id='LC238'>		<span class="n">initBeanWrapper</span><span class="o">(</span><span class="n">bw</span><span class="o">);</span></div><div class='line' id='LC239'><br/></div><div class='line' id='LC240'>		<span class="n">ResultSetMetaData</span> <span class="n">rsmd</span> <span class="o">=</span> <span class="n">rs</span><span class="o">.</span><span class="na">getMetaData</span><span class="o">();</span></div><div class='line' id='LC241'>		<span class="kt">int</span> <span class="n">columnCount</span> <span class="o">=</span> <span class="n">rsmd</span><span class="o">.</span><span class="na">getColumnCount</span><span class="o">();</span></div><div class='line' id='LC242'>		<span class="n">Set</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">populatedProperties</span> <span class="o">=</span> <span class="o">(</span><span class="n">isCheckFullyPopulated</span><span class="o">()</span> <span class="o">?</span> <span class="k">new</span> <span class="n">HashSet</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;()</span> <span class="o">:</span> <span class="kc">null</span><span class="o">);</span></div><div class='line' id='LC243'><br/></div><div class='line' id='LC244'>		<span class="k">for</span> <span class="o">(</span><span class="kt">int</span> <span class="n">index</span> <span class="o">=</span> <span class="mi">1</span><span class="o">;</span> <span class="n">index</span> <span class="o">&lt;=</span> <span class="n">columnCount</span><span class="o">;</span> <span class="n">index</span><span class="o">++)</span> <span class="o">{</span></div><div class='line' id='LC245'>			<span class="n">String</span> <span class="n">column</span> <span class="o">=</span> <span class="n">JdbcUtils</span><span class="o">.</span><span class="na">lookupColumnName</span><span class="o">(</span><span class="n">rsmd</span><span class="o">,</span> <span class="n">index</span><span class="o">);</span></div><div class='line' id='LC246'>			<span class="n">PropertyDescriptor</span> <span class="n">pd</span> <span class="o">=</span> <span class="k">this</span><span class="o">.</span><span class="na">mappedFields</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">column</span><span class="o">.</span><span class="na">replaceAll</span><span class="o">(</span><span class="s">&quot; &quot;</span><span class="o">,</span> <span class="s">&quot;&quot;</span><span class="o">).</span><span class="na">toLowerCase</span><span class="o">());</span></div><div class='line' id='LC247'>			<span class="k">if</span> <span class="o">(</span><span class="n">pd</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC248'>				<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC249'>					<span class="n">Object</span> <span class="n">value</span> <span class="o">=</span> <span class="n">getColumnValue</span><span class="o">(</span><span class="n">rs</span><span class="o">,</span> <span class="n">index</span><span class="o">,</span> <span class="n">pd</span><span class="o">);</span></div><div class='line' id='LC250'>					<span class="k">if</span> <span class="o">(</span><span class="n">logger</span><span class="o">.</span><span class="na">isDebugEnabled</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="n">rowNumber</span> <span class="o">==</span> <span class="mi">0</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC251'>						<span class="n">logger</span><span class="o">.</span><span class="na">debug</span><span class="o">(</span><span class="s">&quot;Mapping column &#39;&quot;</span> <span class="o">+</span> <span class="n">column</span> <span class="o">+</span> <span class="s">&quot;&#39; to property &#39;&quot;</span> <span class="o">+</span></div><div class='line' id='LC252'>								<span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;&#39; of type &quot;</span> <span class="o">+</span> <span class="n">pd</span><span class="o">.</span><span class="na">getPropertyType</span><span class="o">());</span></div><div class='line' id='LC253'>					<span class="o">}</span></div><div class='line' id='LC254'>					<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC255'>						<span class="n">bw</span><span class="o">.</span><span class="na">setPropertyValue</span><span class="o">(</span><span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">(),</span> <span class="n">value</span><span class="o">);</span></div><div class='line' id='LC256'>					<span class="o">}</span></div><div class='line' id='LC257'>					<span class="k">catch</span> <span class="o">(</span><span class="n">TypeMismatchException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC258'>						<span class="k">if</span> <span class="o">(</span><span class="n">value</span> <span class="o">==</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">primitivesDefaultedForNullValue</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC259'>							<span class="n">logger</span><span class="o">.</span><span class="na">debug</span><span class="o">(</span><span class="s">&quot;Intercepted TypeMismatchException for row &quot;</span> <span class="o">+</span> <span class="n">rowNumber</span> <span class="o">+</span></div><div class='line' id='LC260'>									<span class="s">&quot; and column &#39;&quot;</span> <span class="o">+</span> <span class="n">column</span> <span class="o">+</span> <span class="s">&quot;&#39; with value &quot;</span> <span class="o">+</span> <span class="n">value</span> <span class="o">+</span></div><div class='line' id='LC261'>									<span class="s">&quot; when setting property &#39;&quot;</span> <span class="o">+</span> <span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;&#39; of type &quot;</span> <span class="o">+</span> <span class="n">pd</span><span class="o">.</span><span class="na">getPropertyType</span><span class="o">()</span> <span class="o">+</span></div><div class='line' id='LC262'>									<span class="s">&quot; on object: &quot;</span> <span class="o">+</span> <span class="n">mappedObject</span><span class="o">);</span></div><div class='line' id='LC263'>						<span class="o">}</span></div><div class='line' id='LC264'>						<span class="k">else</span> <span class="o">{</span></div><div class='line' id='LC265'>							<span class="k">throw</span> <span class="n">e</span><span class="o">;</span></div><div class='line' id='LC266'>						<span class="o">}</span></div><div class='line' id='LC267'>					<span class="o">}</span></div><div class='line' id='LC268'>					<span class="k">if</span> <span class="o">(</span><span class="n">populatedProperties</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC269'>						<span class="n">populatedProperties</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">());</span></div><div class='line' id='LC270'>					<span class="o">}</span></div><div class='line' id='LC271'>				<span class="o">}</span></div><div class='line' id='LC272'>				<span class="k">catch</span> <span class="o">(</span><span class="n">NotWritablePropertyException</span> <span class="n">ex</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC273'>					<span class="k">throw</span> <span class="k">new</span> <span class="nf">DataRetrievalFailureException</span><span class="o">(</span></div><div class='line' id='LC274'>							<span class="s">&quot;Unable to map column &quot;</span> <span class="o">+</span> <span class="n">column</span> <span class="o">+</span> <span class="s">&quot; to property &quot;</span> <span class="o">+</span> <span class="n">pd</span><span class="o">.</span><span class="na">getName</span><span class="o">(),</span> <span class="n">ex</span><span class="o">);</span></div><div class='line' id='LC275'>				<span class="o">}</span></div><div class='line' id='LC276'>			<span class="o">}</span></div><div class='line' id='LC277'>		<span class="o">}</span></div><div class='line' id='LC278'><br/></div><div class='line' id='LC279'>		<span class="k">if</span> <span class="o">(</span><span class="n">populatedProperties</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">populatedProperties</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="k">this</span><span class="o">.</span><span class="na">mappedProperties</span><span class="o">))</span> <span class="o">{</span></div><div class='line' id='LC280'>			<span class="k">throw</span> <span class="k">new</span> <span class="nf">InvalidDataAccessApiUsageException</span><span class="o">(</span><span class="s">&quot;Given ResultSet does not contain all fields &quot;</span> <span class="o">+</span></div><div class='line' id='LC281'>					<span class="s">&quot;necessary to populate object of class [&quot;</span> <span class="o">+</span> <span class="k">this</span><span class="o">.</span><span class="na">mappedClass</span> <span class="o">+</span> <span class="s">&quot;]: &quot;</span> <span class="o">+</span> <span class="k">this</span><span class="o">.</span><span class="na">mappedProperties</span><span class="o">);</span></div><div class='line' id='LC282'>		<span class="o">}</span></div><div class='line' id='LC283'><br/></div><div class='line' id='LC284'>		<span class="k">return</span> <span class="n">mappedObject</span><span class="o">;</span></div><div class='line' id='LC285'>	<span class="o">}</span></div><div class='line' id='LC286'><br/></div><div class='line' id='LC287'>	<span class="cm">/**</span></div><div class='line' id='LC288'><span class="cm">	 * Initialize the given BeanWrapper to be used for row mapping.</span></div><div class='line' id='LC289'><span class="cm">	 * To be called for each row.</span></div><div class='line' id='LC290'><span class="cm">	 * &lt;p&gt;The default implementation is empty. Can be overridden in subclasses.</span></div><div class='line' id='LC291'><span class="cm">	 * @param bw the BeanWrapper to initialize</span></div><div class='line' id='LC292'><span class="cm">	 */</span></div><div class='line' id='LC293'>	<span class="kd">protected</span> <span class="kt">void</span> <span class="nf">initBeanWrapper</span><span class="o">(</span><span class="n">BeanWrapper</span> <span class="n">bw</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC294'>	<span class="o">}</span></div><div class='line' id='LC295'><br/></div><div class='line' id='LC296'>	<span class="cm">/**</span></div><div class='line' id='LC297'><span class="cm">	 * Retrieve a JDBC object value for the specified column.</span></div><div class='line' id='LC298'><span class="cm">	 * &lt;p&gt;The default implementation calls</span></div><div class='line' id='LC299'><span class="cm">	 * {@link JdbcUtils#getResultSetValue(java.sql.ResultSet, int, Class)}.</span></div><div class='line' id='LC300'><span class="cm">	 * Subclasses may override this to check specific value types upfront,</span></div><div class='line' id='LC301'><span class="cm">	 * or to post-process values return from {@code getResultSetValue}.</span></div><div class='line' id='LC302'><span class="cm">	 * @param rs is the ResultSet holding the data</span></div><div class='line' id='LC303'><span class="cm">	 * @param index is the column index</span></div><div class='line' id='LC304'><span class="cm">	 * @param pd the bean property that each result object is expected to match</span></div><div class='line' id='LC305'><span class="cm">	 * (or {@code null} if none specified)</span></div><div class='line' id='LC306'><span class="cm">	 * @return the Object value</span></div><div class='line' id='LC307'><span class="cm">	 * @throws SQLException in case of extraction failure</span></div><div class='line' id='LC308'><span class="cm">	 * @see org.springframework.jdbc.support.JdbcUtils#getResultSetValue(java.sql.ResultSet, int, Class)</span></div><div class='line' id='LC309'><span class="cm">	 */</span></div><div class='line' id='LC310'>	<span class="kd">protected</span> <span class="n">Object</span> <span class="nf">getColumnValue</span><span class="o">(</span><span class="n">ResultSet</span> <span class="n">rs</span><span class="o">,</span> <span class="kt">int</span> <span class="n">index</span><span class="o">,</span> <span class="n">PropertyDescriptor</span> <span class="n">pd</span><span class="o">)</span> <span class="kd">throws</span> <span class="n">SQLException</span> <span class="o">{</span></div><div class='line' id='LC311'>		<span class="k">return</span> <span class="n">JdbcUtils</span><span class="o">.</span><span class="na">getResultSetValue</span><span class="o">(</span><span class="n">rs</span><span class="o">,</span> <span class="n">index</span><span class="o">,</span> <span class="n">pd</span><span class="o">.</span><span class="na">getPropertyType</span><span class="o">());</span></div><div class='line' id='LC312'>	<span class="o">}</span></div><div class='line' id='LC313'><br/></div><div class='line' id='LC314'><br/></div><div class='line' id='LC315'>	<span class="cm">/**</span></div><div class='line' id='LC316'><span class="cm">	 * Static factory method to create a new BeanPropertyRowMapper</span></div><div class='line' id='LC317'><span class="cm">	 * (with the mapped class specified only once).</span></div><div class='line' id='LC318'><span class="cm">	 * @param mappedClass the class that each row should be mapped to</span></div><div class='line' id='LC319'><span class="cm">	 */</span></div><div class='line' id='LC320'>	<span class="kd">public</span> <span class="kd">static</span> <span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">BeanPropertyRowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">newInstance</span><span class="o">(</span><span class="n">Class</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">mappedClass</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC321'>		<span class="n">BeanPropertyRowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;</span> <span class="n">newInstance</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BeanPropertyRowMapper</span><span class="o">&lt;</span><span class="n">T</span><span class="o">&gt;();</span></div><div class='line' id='LC322'>		<span class="n">newInstance</span><span class="o">.</span><span class="na">setMappedClass</span><span class="o">(</span><span class="n">mappedClass</span><span class="o">);</span></div><div class='line' id='LC323'>		<span class="k">return</span> <span class="n">newInstance</span><span class="o">;</span></div><div class='line' id='LC324'>	<span class="o">}</span></div><div class='line' id='LC325'><br/></div><div class='line' id='LC326'><span class="o">}</span></div></pre></div></td>
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
      <li>&copy; 2014 <span title="0.06972s from github-fe137-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
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


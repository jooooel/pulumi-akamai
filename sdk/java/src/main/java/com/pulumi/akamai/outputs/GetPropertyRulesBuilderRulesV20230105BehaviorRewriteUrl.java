// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrl {
    private @Nullable String behavior;
    private @Nullable Boolean keepQueryString;
    private @Nullable Boolean locked;
    private @Nullable String match;
    private @Nullable Boolean matchMultiple;
    private @Nullable String matchRegex;
    private @Nullable String targetPath;
    private @Nullable String targetPathPrepend;
    private @Nullable String targetRegex;
    private @Nullable String targetUrl;
    private @Nullable String templateUuid;
    private @Nullable String uuid;

    private GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrl() {}
    public Optional<String> behavior() {
        return Optional.ofNullable(this.behavior);
    }
    public Optional<Boolean> keepQueryString() {
        return Optional.ofNullable(this.keepQueryString);
    }
    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    public Optional<Boolean> matchMultiple() {
        return Optional.ofNullable(this.matchMultiple);
    }
    public Optional<String> matchRegex() {
        return Optional.ofNullable(this.matchRegex);
    }
    public Optional<String> targetPath() {
        return Optional.ofNullable(this.targetPath);
    }
    public Optional<String> targetPathPrepend() {
        return Optional.ofNullable(this.targetPathPrepend);
    }
    public Optional<String> targetRegex() {
        return Optional.ofNullable(this.targetRegex);
    }
    public Optional<String> targetUrl() {
        return Optional.ofNullable(this.targetUrl);
    }
    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }
    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrl defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String behavior;
        private @Nullable Boolean keepQueryString;
        private @Nullable Boolean locked;
        private @Nullable String match;
        private @Nullable Boolean matchMultiple;
        private @Nullable String matchRegex;
        private @Nullable String targetPath;
        private @Nullable String targetPathPrepend;
        private @Nullable String targetRegex;
        private @Nullable String targetUrl;
        private @Nullable String templateUuid;
        private @Nullable String uuid;
        public Builder() {}
        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.keepQueryString = defaults.keepQueryString;
    	      this.locked = defaults.locked;
    	      this.match = defaults.match;
    	      this.matchMultiple = defaults.matchMultiple;
    	      this.matchRegex = defaults.matchRegex;
    	      this.targetPath = defaults.targetPath;
    	      this.targetPathPrepend = defaults.targetPathPrepend;
    	      this.targetRegex = defaults.targetRegex;
    	      this.targetUrl = defaults.targetUrl;
    	      this.templateUuid = defaults.templateUuid;
    	      this.uuid = defaults.uuid;
        }

        @CustomType.Setter
        public Builder behavior(@Nullable String behavior) {
            this.behavior = behavior;
            return this;
        }
        @CustomType.Setter
        public Builder keepQueryString(@Nullable Boolean keepQueryString) {
            this.keepQueryString = keepQueryString;
            return this;
        }
        @CustomType.Setter
        public Builder locked(@Nullable Boolean locked) {
            this.locked = locked;
            return this;
        }
        @CustomType.Setter
        public Builder match(@Nullable String match) {
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder matchMultiple(@Nullable Boolean matchMultiple) {
            this.matchMultiple = matchMultiple;
            return this;
        }
        @CustomType.Setter
        public Builder matchRegex(@Nullable String matchRegex) {
            this.matchRegex = matchRegex;
            return this;
        }
        @CustomType.Setter
        public Builder targetPath(@Nullable String targetPath) {
            this.targetPath = targetPath;
            return this;
        }
        @CustomType.Setter
        public Builder targetPathPrepend(@Nullable String targetPathPrepend) {
            this.targetPathPrepend = targetPathPrepend;
            return this;
        }
        @CustomType.Setter
        public Builder targetRegex(@Nullable String targetRegex) {
            this.targetRegex = targetRegex;
            return this;
        }
        @CustomType.Setter
        public Builder targetUrl(@Nullable String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        @CustomType.Setter
        public Builder templateUuid(@Nullable String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }
        @CustomType.Setter
        public Builder uuid(@Nullable String uuid) {
            this.uuid = uuid;
            return this;
        }
        public GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrl build() {
            final var _resultValue = new GetPropertyRulesBuilderRulesV20230105BehaviorRewriteUrl();
            _resultValue.behavior = behavior;
            _resultValue.keepQueryString = keepQueryString;
            _resultValue.locked = locked;
            _resultValue.match = match;
            _resultValue.matchMultiple = matchMultiple;
            _resultValue.matchRegex = matchRegex;
            _resultValue.targetPath = targetPath;
            _resultValue.targetPathPrepend = targetPathPrepend;
            _resultValue.targetRegex = targetRegex;
            _resultValue.targetUrl = targetUrl;
            _resultValue.templateUuid = templateUuid;
            _resultValue.uuid = uuid;
            return _resultValue;
        }
    }
}

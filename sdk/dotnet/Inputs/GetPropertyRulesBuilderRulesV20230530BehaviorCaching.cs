// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorCachingArgs : global::Pulumi.InvokeArgs
    {
        [Input("behavior")]
        public string? Behavior { get; set; }

        [Input("cacheControlDirectives")]
        public string? CacheControlDirectives { get; set; }

        [Input("cacheabilitySettings")]
        public string? CacheabilitySettings { get; set; }

        [Input("defaultTtl")]
        public string? DefaultTtl { get; set; }

        [Input("enhancedRfcSupport")]
        public bool? EnhancedRfcSupport { get; set; }

        [Input("expirationSettings")]
        public string? ExpirationSettings { get; set; }

        [Input("honorMaxAge")]
        public bool? HonorMaxAge { get; set; }

        [Input("honorMustRevalidate")]
        public bool? HonorMustRevalidate { get; set; }

        [Input("honorNoCache")]
        public bool? HonorNoCache { get; set; }

        [Input("honorNoStore")]
        public bool? HonorNoStore { get; set; }

        [Input("honorPrivate")]
        public bool? HonorPrivate { get; set; }

        [Input("honorProxyRevalidate")]
        public bool? HonorProxyRevalidate { get; set; }

        [Input("honorSMaxage")]
        public bool? HonorSMaxage { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("mustRevalidate")]
        public bool? MustRevalidate { get; set; }

        [Input("revalidationSettings")]
        public string? RevalidationSettings { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("ttl")]
        public string? Ttl { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorCachingArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorCachingArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorCachingArgs();
    }
}
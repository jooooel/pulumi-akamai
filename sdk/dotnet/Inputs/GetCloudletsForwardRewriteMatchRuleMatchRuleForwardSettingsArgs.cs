// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("originId")]
        public Input<string>? OriginId { get; set; }

        [Input("pathAndQs")]
        public Input<string>? PathAndQs { get; set; }

        [Input("useIncomingQueryString")]
        public Input<bool>? UseIncomingQueryString { get; set; }

        public GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsInputArgs()
        {
        }
        public static new GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsInputArgs Empty => new GetCloudletsForwardRewriteMatchRuleMatchRuleForwardSettingsInputArgs();
    }
}

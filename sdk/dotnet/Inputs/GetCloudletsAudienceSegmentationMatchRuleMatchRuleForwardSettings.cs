// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettingsArgs : global::Pulumi.InvokeArgs
    {
        [Input("originId")]
        public string? OriginId { get; set; }

        [Input("pathAndQs")]
        public string? PathAndQs { get; set; }

        [Input("useIncomingQueryString")]
        public bool? UseIncomingQueryString { get; set; }

        public GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettingsArgs()
        {
        }
        public static new GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettingsArgs Empty => new GetCloudletsAudienceSegmentationMatchRuleMatchRuleForwardSettingsArgs();
    }
}

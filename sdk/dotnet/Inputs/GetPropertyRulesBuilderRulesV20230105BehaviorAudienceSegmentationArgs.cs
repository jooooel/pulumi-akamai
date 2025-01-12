// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("cloudletPolicy")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationCloudletPolicyInputArgs>? CloudletPolicy { get; set; }

        [Input("cloudletSharedPolicy")]
        public Input<int>? CloudletSharedPolicy { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("isSharedPolicy")]
        public Input<bool>? IsSharedPolicy { get; set; }

        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("populationCookieAutomaticSalt")]
        public Input<bool>? PopulationCookieAutomaticSalt { get; set; }

        [Input("populationCookieDomain")]
        public Input<string>? PopulationCookieDomain { get; set; }

        [Input("populationCookieIncludeRuleName")]
        public Input<bool>? PopulationCookieIncludeRuleName { get; set; }

        [Input("populationCookieSalt")]
        public Input<string>? PopulationCookieSalt { get; set; }

        [Input("populationCookieType")]
        public Input<string>? PopulationCookieType { get; set; }

        [Input("populationDuration")]
        public Input<string>? PopulationDuration { get; set; }

        [Input("populationRefresh")]
        public Input<bool>? PopulationRefresh { get; set; }

        [Input("populationTitle")]
        public Input<string>? PopulationTitle { get; set; }

        [Input("segmentTrackingCookieName")]
        public Input<string>? SegmentTrackingCookieName { get; set; }

        [Input("segmentTrackingCustomHeader")]
        public Input<string>? SegmentTrackingCustomHeader { get; set; }

        [Input("segmentTrackingMethod")]
        public Input<string>? SegmentTrackingMethod { get; set; }

        [Input("segmentTrackingQueryParam")]
        public Input<string>? SegmentTrackingQueryParam { get; set; }

        [Input("segmentTrackingTitle")]
        public Input<string>? SegmentTrackingTitle { get; set; }

        [Input("specifyPopulationCookieDomain")]
        public Input<bool>? SpecifyPopulationCookieDomain { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorAudienceSegmentationInputArgs();
    }
}

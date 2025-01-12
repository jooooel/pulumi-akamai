// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdVodResult
    {
        public readonly string? CatalogSize;
        public readonly string? ContentType;
        public readonly bool? Dash;
        public readonly bool? Hds;
        public readonly bool? Hls;
        public readonly bool? Locked;
        public readonly string? PopularityDistribution;
        public readonly string? SegmentDurationDash;
        public readonly string? SegmentDurationHds;
        public readonly string? SegmentDurationHls;
        public readonly string? SegmentDurationSmooth;
        public readonly string? SegmentSizeDash;
        public readonly string? SegmentSizeHds;
        public readonly string? SegmentSizeHls;
        public readonly string? SegmentSizeSmooth;
        public readonly bool? Smooth;
        public readonly string? TemplateUuid;
        public readonly string? Uuid;

        [OutputConstructor]
        private GetPropertyRulesBuilderRulesV20230105BehaviorContentCharacteristicsWsdVodResult(
            string? catalogSize,

            string? contentType,

            bool? dash,

            bool? hds,

            bool? hls,

            bool? locked,

            string? popularityDistribution,

            string? segmentDurationDash,

            string? segmentDurationHds,

            string? segmentDurationHls,

            string? segmentDurationSmooth,

            string? segmentSizeDash,

            string? segmentSizeHds,

            string? segmentSizeHls,

            string? segmentSizeSmooth,

            bool? smooth,

            string? templateUuid,

            string? uuid)
        {
            CatalogSize = catalogSize;
            ContentType = contentType;
            Dash = dash;
            Hds = hds;
            Hls = hls;
            Locked = locked;
            PopularityDistribution = popularityDistribution;
            SegmentDurationDash = segmentDurationDash;
            SegmentDurationHds = segmentDurationHds;
            SegmentDurationHls = segmentDurationHls;
            SegmentDurationSmooth = segmentDurationSmooth;
            SegmentSizeDash = segmentSizeDash;
            SegmentSizeHds = segmentSizeHds;
            SegmentSizeHls = segmentSizeHls;
            SegmentSizeSmooth = segmentSizeSmooth;
            Smooth = smooth;
            TemplateUuid = templateUuid;
            Uuid = uuid;
        }
    }
}
